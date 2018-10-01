package com.ambroziepaval.didemo.controllers;

import com.ambroziepaval.didemo.services.GreetingService;

/**
 * Created by Ambrozie on 01/10/2018
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreetings();
    }
}
