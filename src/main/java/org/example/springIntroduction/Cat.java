package org.example.springIntroduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    public Cat() {
        System.out.println("пустой конструктор из Cat");
    }
}
