package org.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc* (..))")//вынесли одинаковые выражения
    public void allAddMethods(){};
}
