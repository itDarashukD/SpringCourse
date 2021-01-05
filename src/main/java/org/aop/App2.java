package org.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        University university = context.getBean("university",University.class);

        university.addStudents();
        List<Student> stList=university.getStudents();
        System.out.println("fffffffffffffffffffff");
        System.out.println(stList);


    }
}
