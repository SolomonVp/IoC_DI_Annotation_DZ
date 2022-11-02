package org.example;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("--- Бин dogBean создан ---");
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }
}
