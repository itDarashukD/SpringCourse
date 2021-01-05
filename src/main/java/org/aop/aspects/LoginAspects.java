package org.aop.aspects;

import org.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoginAspects {

    @Before("org.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {//с помощью JoinPoint можем получитьданные о вызываемом методе
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);
        System.out.println("methodSignature.getName()" + methodSignature.getName());//имя метода
        System.out.println("methodSignature.getMethod()" + methodSignature.getMethod());//вся инфа о методе
        System.out.println("methodSignature.getReturnType()" + methodSignature.getReturnType());//возващаемый тип

        //если нам нужно производить действия только с методом addBook
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments
            ) {
                if (obj instanceof Book) {
                    System.out.println("Информация о книге :" + ((Book) obj).getName() + " " + ((Book) obj).getAuthor() + " "
                            + ((Book) obj).getYearOfPublished());
                } else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет - " + obj);

                }

            }
        }
        System.out.println("логирование попытки получить книгу/журнал");
        System.out.println("__________________________________________________");
    }
}
