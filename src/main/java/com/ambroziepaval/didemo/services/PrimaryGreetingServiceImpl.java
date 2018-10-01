package com.ambroziepaval.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Ambrozie on 01/10/2018
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello - Primary Greeting Service";
    }
}
