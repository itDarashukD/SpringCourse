package org.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {


    public void getBook() {
        System.out.println("получаем книгу из UniversityLibrary");
        System.out.println("_____________________________________");
    }

    public void getMagazine() {
        System.out.println("получаем Журнал из UniversityLibrary ");
        System.out.println("_____________________________________");
    }

    public String  returnBook() {
        System.out.println("возвращаем книгу в UniversityLibrary");
        return "Война и мир";
    }

    public void returnMagazine() {
        System.out.println("возвращаем журнал в UniversityLibrary");
        System.out.println("_____________________________________");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("добавляем книгу в UniversityLibrary");
        System.out.println("_____________________________________");
    }

    public void addMagazine() {
        System.out.println("добавляем журнал в UniversityLibrary");
        System.out.println("_____________________________________");
    }

}
