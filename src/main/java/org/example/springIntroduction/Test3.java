package org.example.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=         //здесь создается контейнер Бинов, он получает готовые бины из Application context
                new ClassPathXmlApplicationContext("ApplicationContext.xml.tld");

        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();

        context.close();
    }
}

