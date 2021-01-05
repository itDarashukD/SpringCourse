package org.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> studentList = new ArrayList<>();

    public void addStudents() {

        Student student1 = new Student("Darashuk", 4, 7.5);
        Student student2 = new Student("Lulis", 5, 8.4);
        Student student3 = new Student("Loginov", 3, 8.7);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("старт метода getStudents()");
        //   System.out.println(studentList.get(3));//сделали exception
        System.out.println(studentList);

        return studentList;
    }


}
