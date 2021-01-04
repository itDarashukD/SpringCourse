package org.aop.aspects;


import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
class LoggingAspect {
    @Before("execution(* get*())")//вызовется метод c любым Мод.Доступа,начинающийся с Get
    public void beforeGetBookAdvice() {
        System.out.println("этот метод описывает ,что должно произойти ДО вызова метода get*");
    }


}
