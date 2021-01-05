package org.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add* (..))")//вынесли одинаковые выражения
    public void allAddMethods(){};
}
