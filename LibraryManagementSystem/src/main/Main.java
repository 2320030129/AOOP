package main;

import library.Book;
import library.Library;
import members.Member;
import borrowing.Borrowing;

public class Main {
    public static void main(String[] args) {
        // Create Library
        Library library = new Library();

        // Create Books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Add Books to Library
        library.addBook(book1);
        library.addBook(book2);

        // Create Members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Borrow Books
        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);

        // Display Borrowing Information
        for (Borrowing borrowing : library.getBorrowings()) {
            System.out.println("Book: " + borrowing.getBook().getTitle() +
                               ", Borrowed by: " + borrowing.getMember().getName());
        }
    }
}
