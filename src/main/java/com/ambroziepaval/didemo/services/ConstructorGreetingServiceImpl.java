package com.ambroziepaval.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Ambrozie on 01/10/2018
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello - I was injected by the constructor!";
    }
}
