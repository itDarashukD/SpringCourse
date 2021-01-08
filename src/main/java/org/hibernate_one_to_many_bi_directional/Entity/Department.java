package org.hibernate_one_to_many_bi_directional.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department",
            fetch = FetchType.LAZY) //т.к.Департамент один, а работников много = @oneToMany
    private List<Employee>employeeList;

    public Department() {
    }

    public Department( String name, int maxSalary, int minSalary) {

        this.name = name;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addingToEmployeeList(Employee employee){ //т.к.работников мнго и  @OneToMany - будем помещать их в Лист
        if (employeeList == null) {
            employeeList=new ArrayList<>();
             }
          employeeList.add(employee);
        employee.setDepartment(this);
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

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +

                '}';
    }
}
