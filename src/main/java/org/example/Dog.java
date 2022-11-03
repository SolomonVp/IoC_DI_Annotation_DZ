package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet{


    public Dog() {
        System.out.println("--- Бин dogBean создан ---");
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }

//    @PostConstruct
//    protected void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }
}
