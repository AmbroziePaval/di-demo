package com.ambroziepaval.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello World! - Original";

    @Override
    public String sayGreetings() {
        return HELLO_WORLD;
    }
}
