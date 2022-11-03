package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Cat catBean() {
        return new Cat();
    }


    @Bean
    @Scope("singleton")
    public Person personBean() {
        return new Person(catBean());
    }
}
