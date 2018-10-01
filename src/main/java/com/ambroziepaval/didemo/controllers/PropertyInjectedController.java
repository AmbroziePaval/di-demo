package com.ambroziepaval.didemo.controllers;

import com.ambroziepaval.didemo.services.GreetingServiceImpl;

/**
 * Created by Ambrozie on 01/10/2018
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreetings();
    }
}
