package org.example;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:myApp.properties")
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
