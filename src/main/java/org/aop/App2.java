package org.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        University university = context.getBean("university", University.class);

        try {
            university.addStudents();
            List<Student> stList = university.getStudents();

            System.out.println(stList);
        } catch (Exception e) {
            System.out.println("выброшено исключение " + e);
        }

    }
}
