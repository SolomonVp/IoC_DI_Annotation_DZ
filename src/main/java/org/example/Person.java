package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("--- Бин personBean создан ---");
        this.pet = pet;
    }

    public void goHome() {
        System.out.println("Пойдем домой");
        pet.say();
    }
}
