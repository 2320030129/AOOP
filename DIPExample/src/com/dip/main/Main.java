// File: Main.java
package com.dip.main;

import com.dip.application.MyApplication;
import com.dip.service.EmailService;
import com.dip.service.SMSService;

public class Main {
    public static void main(String[] args) {
        // Using EmailService
        MyApplication app1 = new MyApplication(new EmailService());
        app1.processMessage("Hello via Email", "email@example.com");

        // Using SMSService
        MyApplication app2 = new MyApplication(new SMSService());
        app2.processMessage("Hello via SMS", "123-456-7890");
    }
}
