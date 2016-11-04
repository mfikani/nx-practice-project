package com.nx.practice.di;

import com.google.inject.AbstractModule;

/**
 * @author mhachem on 11/4/2016.
 */
public class AppInjector extends AbstractModule {

    @Override
    protected void configure() {
        // binds message service to FaceService implementation
        bind(MessageService.class).to(FacebookService.class);
    }

}
