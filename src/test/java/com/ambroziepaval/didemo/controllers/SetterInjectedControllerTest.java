package com.ambroziepaval.didemo.controllers;

import com.ambroziepaval.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ambrozie on 01/10/2018
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello() {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
    }
}