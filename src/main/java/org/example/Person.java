package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    Pet pet;

    @Autowired
    public Person(@Qualifier("dogBean")Pet pet) {
        System.out.println("--- Бин personBean создан ---");
        this.pet = pet;
    }


//    public Person() {
//        System.out.println("--- Бин personBean создан ---");
//    }

    public void goHome() {
        System.out.println("Пойдем домой");
        pet.say();
    }

//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }


}
