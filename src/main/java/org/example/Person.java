package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //    @Autowired
//    @Qualifier("catBean")
    Pet pet;
        @Value("${person.name}")
    private String name;
        @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("dogBean")Pet pet) {
//        System.out.println("--- Бин personBean создан ---");
//        this.pet = pet;
//    }


    public Person(Pet pet) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
