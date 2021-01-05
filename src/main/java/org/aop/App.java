package org.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

        Book book = context.getBean("book", Book.class);

        universityLibrary.getBook();
        universityLibrary.addBook("Dzmitry",book);
        universityLibrary.getMagazine();
        universityLibrary.addMagazine();

        context.close();

    }
}
