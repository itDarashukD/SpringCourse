package org.example.springIntroduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }


    public void callYourPet(){
        System.out.println("hello my dear pet!");
        pet.say();
    }
}
