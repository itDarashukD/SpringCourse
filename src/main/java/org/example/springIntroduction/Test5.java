package org.example.springIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
  Person person = context.getBean("person",Person.class);
  person.callYourPet();

    //    System.out.println(person.getAge()+" "+ person.getName());

    }
}
