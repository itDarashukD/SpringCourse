package org.aop.aspects;

import org.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {

    @Before("execution(* getStudents() )")
    public void beforeGetStudentsFromUniversity() {
        System.out.println("beforeGetStudentsFromUniversity() : логируем получение списка студентов перед методом getStudents()");
    }

//    // @AfterReturning очень мощная - можно перехватывать return "execution(* getStudents()) этого метода и менять результат,
//    //в данном случае листа, - после чего использовать уже новое значение этого листа,ниже меняем значения и выаодим их на экран
//    @AfterReturning(pointcut = "execution(* getStudents() )", returning = "stList")
//    public void afterReturningStudentsFromUniversity(List<Student> stList) {
//
//        stList.get(0).setNameSurname("Mr.Darashuk ");
//        stList.get(0).setAverageGrade(9.99);
//
//        System.out.println("afterReturningStudentsFromUniversity() : логируем получение списка студентов поле выполнения getStudents()");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents() )",throwing = "exception") //срабатывает при возникновении exception в методе (* getStudents() )
//    public void afterThrowingStudentsFromUniversity(Throwable exception){
//        System.out.println("loggin #4 - при возникновении exception в методе (* getStudents() )"+exception);
//    }

    @After("execution(* getStudents() )")
    public void afterGetStudentsFromUniversity(){
        System.out.println("afterGetStudentsFromUniversity() : Логируем логику вне зависимости от exception и др." +
                "этот метод выполниться полюбому");
    }

}
