package org.example.springIntroduction;

public class Person {
    private Pet pet;
    private String name;
    private int age;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("присваиваем имя" );
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("присваиваем возраст" );
        this.age = age;
    }
}
