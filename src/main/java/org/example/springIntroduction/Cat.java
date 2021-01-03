package org.example.springIntroduction;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

}
