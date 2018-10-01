package com.ambroziepaval.didemo.controllers;

import com.ambroziepaval.didemo.services.GreetingService;

/**
 * Created by Ambrozie on 01/10/2018
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreetings();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
