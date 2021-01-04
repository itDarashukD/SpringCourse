package org.example.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext3.xml.tld");

     //   Person person  = context.getBean("person",Person.class);

//        Cat cat = context.getBean("cat",Cat.class);
//        Cat cat1 = context.getBean("cat",Cat.class);

        Dog dog = context.getBean("dog",Dog.class);
        Dog dog1 = context.getBean("dog",Dog.class);





     //   System.out.println(cat==cat1);

        System.out.println(dog==dog1);

        context.close();
    }
}
