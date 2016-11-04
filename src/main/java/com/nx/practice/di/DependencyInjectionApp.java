package com.nx.practice.di;

import com.google.inject.Inject;

/**
 * @author mhachem on 11/4/2016.
 */
public class DependencyInjectionApp {

    private MessageService messageService;

    /* Constructor based dependency injection
    @Inject
    public DependencyInjectionApp(MessageService messageService) {
        this.messageService = messageService;
    }
    */

    @Inject
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean sendMessage(String msg, String recipient) {
        return messageService.sendMessage(msg, recipient);
    }

}
