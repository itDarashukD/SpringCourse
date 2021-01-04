package org.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary  {


    public void getBook() {

        System.out.println("получаем книгу из UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("получаем Журнал из UniversityLibrary ");
    }

    public void returnBook() {

        System.out.println("возвращаем книгу в UniversityLibrary");
    }

    public void returnMagazine()  {  System.out.println("возвращаем журнал в UniversityLibrary");}

    public void addBook() {

        System.out.println("добавляем книгу в UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("добавляем журнал в UniversityLibrary");
    }

}
