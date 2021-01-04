package org.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends UniversityLibrary {
    @Override
    public void getBook() {
        System.out.println("получаем книгу из SchoolLibrary ");
    }

    public void getMagazine() {
         System.out.println("получаем Журнал из SchoolLibrary ");
    }

}
