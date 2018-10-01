package com.ambroziepaval.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ambrozie on 01/10/2018
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Servicio de Saludo Primario";
    }
}
