package org.example.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
      ClassPathXmlApplicationContext context=
              new ClassPathXmlApplicationContext("ApplicationContext3.xml.tld");

  Person person = context.getBean("person",Person.class);
  person.callYourPet();

    }
}
