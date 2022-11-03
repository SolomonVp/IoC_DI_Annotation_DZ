package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
}
