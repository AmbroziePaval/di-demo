package com.ambroziepaval.didemo;

import com.ambroziepaval.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

//        MyController myController = (MyController) applicationContext.getBean("myController");

//        System.out.println(myController.hello());
//        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
    }
}
