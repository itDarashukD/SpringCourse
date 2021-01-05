package org.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class ExceptionHandlerAspects {

@Before("org.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionAdvice(){
    System.out.println("проверка на Exception");
    System.out.println("__________________________________________________");
}
}

