package org.aop.aspects;

import org.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UniversityLoggingAspect {

    @Before("execution(* getStudents() )")
    public void beforeGetStudentsFromUniversity() {
        System.out.println("beforeGetStudentsFromUniversity() : логируем получение списка студентов перед методом getStudents()");
    }

    // @AfterReturning очень мощная - можно перехватывать return "execution(* getStudents()) этого метода и менять результат,
    //в данном случае листа, - после чего использовать уже новое значение этого листа,ниже меняем значения и выаодим их на экран
    @AfterReturning(pointcut = "execution(* getStudents() )", returning = "stList")
    public void afterReturningStudentsFromUniversity(List<Student> stList) {

        stList.get(0).setNameSurname("Mr.Darashuk ");
        stList.get(0).setAverageGrade(9.99);

        System.out.println("afterReturningStudentsFromUniversity() : логируем получение списка студентов поле выполнения getStudents()");
    }

}
