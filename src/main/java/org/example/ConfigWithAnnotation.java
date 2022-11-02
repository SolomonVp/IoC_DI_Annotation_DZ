package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Cat myCat = context.getBean("cat", Cat.class);
//
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.goHome();

        context.close();
    }
}
