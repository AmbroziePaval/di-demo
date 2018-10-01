package com.ambroziepaval.didemo.controllers;

import com.ambroziepaval.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Ambrozie on 01/10/2018
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello");
        return greetingService.sayGreetings();
    }
}
