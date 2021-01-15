package org.example.springIntroduction;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example.springIntroduction")
public class MyConfig {

    @Bean
    public Pet myCatBean(){
        return new Cat();
    }

    @Bean
    public Person myPerson(){
        return new Person(myCatBean());
    }
}
