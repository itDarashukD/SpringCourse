package org.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook(){

        System.out.println("беру книгу из UniversityLibrary");
    }
    public void getMagazine() {
        System.out.println("получаем Журнал из UniversityLibrary ");
    }

}
