package org.aop.aspects;


import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
class LoggingAndSecurityAspect {

    @Pointcut("execution(* org.aop.UniversityLibrary.* (..))")
    private void allMethods() {
    }

    @Pointcut("execution(* org.aop.UniversityLibrary.getBook())")
    private void getBookFromUniversLibrary() {
    }

    @Pointcut("allMethods() && !getBookFromUniversLibrary()")
    private void callAllWithoutGetBook() {
    }

    @Before("callAllWithoutGetBook()")
    public void callBeforeAllWithoutGetBook(){
        System.out.println("log #10");
    }





//@Pointcut("execution(* get*())")
//    private void allGetMethods(){};
//
//@Pointcut("execution(* return*())")
//private void allReturnMethods(){};
//
//@Pointcut("allGetMethods()||allReturnMethods()")
//private void allMethods(){};
//
//@Before("allGetMethods()")
//public void callBeforeGetMethods(){
//    System.out.println("writing Log#1");
//}
//
//@Before("allReturnMethods()")
//public void callBeforeReturnMethods(){
//    System.out.println("writing Log#2");
//}
//
//@Before("allMethods()")
//public void callBeforeAnyMethods(){
//    System.out.println("writing Log#3");
//}


//
//    @Pointcut("execution(* get* ())")//вынесли одинаковые выражения
//    public void allGetMethods(){};
//
//
//    @Before("allGetMethods()")//вызовется метод c любым Мод.Доступа,начинающийся с Get
//    public void beforeGetLoggingAdvice() {
//        System.out.println("попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//
//        System.out.println("попытка получения прав на получение книги/журнала");
//    }


}
