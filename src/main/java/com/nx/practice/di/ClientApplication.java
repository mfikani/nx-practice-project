package com.nx.practice.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author mhachem on 11/4/2016.
 */
public class ClientApplication {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        DependencyInjectionApp app = injector.getInstance(DependencyInjectionApp.class);
        app.sendMessage("hello guice!", "foo");
    }

}
