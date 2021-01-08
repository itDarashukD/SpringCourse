package org.hibernate_one_to_mani_uni_derectional.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String surname;
    private int salary;


   @ManyToOne(cascade = CascadeType.ALL) //т.к.работников много, а департамент один - @ManyToOne
   @JoinColumn(name = "department_id") //Foreign key сфзываем таблицы department и employee
    private Department department;

    public Employee() {
    }

    public Employee(  String name, String surname, int salary ) {

        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
