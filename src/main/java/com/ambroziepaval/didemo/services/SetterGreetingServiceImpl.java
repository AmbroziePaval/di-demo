package com.ambroziepaval.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello - I was injected by the getter";
    }
}
