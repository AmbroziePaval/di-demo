package com.ambroziepaval.didemo.services;

/**
 * Created by jt on 5/24/17.
 */
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getSpanishGreeting();
    }
}
