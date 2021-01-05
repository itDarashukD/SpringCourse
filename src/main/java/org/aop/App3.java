package org.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        System.out.println("start main");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

        String bookName = universityLibrary.returnBook();
        System.out.println("в библиотеку вернули " + bookName);

        context.close();

        System.out.println("start main");
    }
}
