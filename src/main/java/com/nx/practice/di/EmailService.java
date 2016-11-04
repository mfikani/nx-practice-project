package com.nx.practice.di;

import com.google.inject.Singleton;

/**
 * @author mhachem on 11/4/2016.
 */
@Singleton
public class EmailService implements MessageService {

    @Override
    public boolean sendMessage(String msg, String recipient) {
        System.out.printf("Email:\nmessage: %s\nsent to: %s\n", msg, recipient);
        return true;
    }

}
