package org.example.springIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;
    private String name;
    private int age;


    //производим DI Бина person с Любым бином Типа PET,- это Cat и Dog
    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;

    }

    public Person() {
        System.out.println("создаем пустой конструктор");
    }


//    @Autowired
//    @Qualifier("cat")
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("внедрение через Сеттер");
    }

    public void callYourPet() {
        System.out.println("hello my dear pet!");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("присваиваем имя");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("присваиваем возраст");
        this.age = age;
    }
}
