package org.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLoggingAspect {

    //Мощный Адвайс - может делать несколько разных функций
    @Around("execution(String returnBook() )")
    public Object aroundExecutingMethodReturnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("aroundExecutingMethodReturnBook() : в библиотеку начинают возвращают книгу ");

     // Object targetMethodResults =  proceedingJoinPoint.proceed(); //результат выполнения метода сохраняем в targetMethodResults
        Object targetMethodResults ="Война и мир"; //изменили вывод

        System.out.println("aroundExecutingMethodReturnBook() : в библиотеку успешно вернули книгу ");

        return targetMethodResults; //результат выполнения метода возвращаем

    }

}
