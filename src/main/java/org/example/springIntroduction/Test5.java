package org.example.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext2.xml.tld");

        //вызывается метод Init()-после созданияя Бина

        Pet pet2 = context.getBean("myPet2",Pet.class);
        pet2.say();

        Pet pet3 = context.getBean("myPet3",Pet.class);//Prototype
        pet3.say();

        context.close();
        //вызывается метод Destroy()-после завершения работы - context.close();
        //если scope = prototype, то destroy не будет вызываться

    }
}
