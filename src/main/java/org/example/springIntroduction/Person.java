package org.example.springIntroduction;

public class Person {
    private Pet pet;


    public Person() {
        System.out.println("создаем пустой конструктор");
    }
    //внедрение зависимости ччерез сеттер
    //сюда из Application приходит pet==setPet
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("внедрение через Сеттер");
    }

    public void callYourPet(){
        System.out.println("hello my dear pet!");
        pet.say();
    }
}
