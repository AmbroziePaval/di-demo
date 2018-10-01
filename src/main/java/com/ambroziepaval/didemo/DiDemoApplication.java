package com.ambroziepaval.didemo;

import com.ambroziepaval.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");
        myController.hello();
    }
}
