package org.example.springIntroduction;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("gav-gav");
    }

    public Dog() {
        System.out.println("пустой конструктор из Dog");
    }
}
