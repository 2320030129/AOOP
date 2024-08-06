// File: MyApplication.java
package com.dip.application;

import com.dip.service.MessageService;

public class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        this.messageService.sendMessage(message, recipient);
    }
}
