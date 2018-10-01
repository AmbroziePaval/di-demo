package com.ambroziepaval.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Ambrozie on 01/10/2018
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello World!";

    @Override
    public String sayGreetings() {
        return HELLO_WORLD;
    }
}
