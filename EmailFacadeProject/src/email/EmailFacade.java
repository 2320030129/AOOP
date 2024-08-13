package email;

import java.io.*;
import java.net.Socket;

public class EmailFacade {

    private String smtpServer;
    private int smtpPort;
    private String username;
    private String password;

    public EmailFacade(String smtpServer, int smtpPort, String username, String password) {
        this.smtpServer = smtpServer;
        this.smtpPort = smtpPort;
        this.username = username;
        this.password = password;
    }

    public void sendEmail(String to, String subject, String body) throws IOException {
        try (Socket socket = new Socket(smtpServer, smtpPort);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            // Read server response
            String response = reader.readLine();
            System.out.println(response);

            // Send EHLO command
            writer.println("EHLO localhost");
            response = reader.readLine();
            System.out.println(response);

            // Authenticate if necessary (basic example)
            writer.println("AUTH LOGIN");
            response = reader.readLine();
            System.out.println(response);
            writer.println(new String(java.util.Base64.getEncoder().encode(username.getBytes())));
            response = reader.readLine();
            System.out.println(response);
            writer.println(new String(java.util.Base64.getEncoder().encode(password.getBytes())));
            response = reader.readLine();
            System.out.println(response);

            // Send MAIL FROM
            writer.println("MAIL FROM:<" + username + ">");
            response = reader.readLine();
            System.out.println(response);

            // Send RCPT TO
            writer.println("RCPT TO:<" + to + ">");
            response = reader.readLine();
            System.out.println(response);

            // Send DATA
            writer.println("DATA");
            response = reader.readLine();
            System.out.println(response);

            // Send email content
            writer.println("Subject: " + subject);
            writer.println("From: " + username);
            writer.println("To: " + to);
            writer.println();
            writer.println(body);
            writer.println(".");
            response = reader.readLine();
            System.out.println(response);

            // Send QUIT
            writer.println("QUIT");
            response = reader.readLine();
            System.out.println(response);
        }
    }

    public static void main(String[] args) {
        String smtpServer = "smtp.gmail.com"; // Replace with your SMTP server
        int smtpPort = 587; // or 25 for non-encrypted
        String username = "your-email@example.com"; // Replace with your email
        String password = "your-email-password"; // Replace with your password

        EmailFacade emailFacade = new EmailFacade(smtpServer, smtpPort, username, password);

        try {
            emailFacade.sendEmail("recipient@example.com", "Test Subject", "This is a test email.");
            System.out.println("Email sent successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
