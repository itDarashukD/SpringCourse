package org.example.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml.tld");

        Dog dog1 = context.getBean("myPet",Dog.class);
        Dog dog2 = context.getBean("myPet",Dog.class);

        System.out.println(dog1==dog2);
        System.out.println(dog1.equals(dog2));//  true т.к.по умолчанию Scope=Singleton,то это один и тотже объект

        //т.к.по   Scope=Prototype,то это разные объекты и создаются они не сразу после инициализации ApplicationContext2.xml.tld"
        //а только после вызова этого объекта context.getBean("myPet",Dog.class);

        Dog dog3 = context.getBean("myPet2",Dog.class);
        Dog dog4 = context.getBean("myPet2",Dog.class);

        System.out.println(dog3==dog4);
        System.out.println(dog3.equals(dog4));//  false т.к.по умолчанию Scope=Singleton,то это один и тотже объект

        context.close();
    }
}
