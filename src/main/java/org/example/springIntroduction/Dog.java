package org.example.springIntroduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

 public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("gav-gav");
    }

    public Dog() {
        System.out.println("пустой конструктор из Dog");
    }
    @PostConstruct
    public void init(){
        System.out.println("init method from Dog");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method from Dog");
    }
}
