package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public Cat() {
        System.out.println("--- Бин кота создан ---");
    }

    public void say() {
        System.out.println("Мяу-Мяу!");
    }
}
