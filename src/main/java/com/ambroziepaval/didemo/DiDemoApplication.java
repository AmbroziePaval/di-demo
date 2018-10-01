package com.ambroziepaval.didemo;

import com.ambroziepaval.didemo.controllers.ConstructorInjectedController;
import com.ambroziepaval.didemo.controllers.MyController;
import com.ambroziepaval.didemo.controllers.PropertyInjectedController;
import com.ambroziepaval.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");
        myController.hello();

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }
}
