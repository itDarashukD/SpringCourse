package org.hibernate_one_to_many_bi_directional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_one_to_many_bi_directional.Entity.Department;
import org.hibernate_one_to_many_bi_directional.Entity.Employee;


public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()  //создаем Фабрику сессий из конфига и класса с БД
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();// открываем новую сессию

//            //Добавить в таблицу
//           Department department = new Department("Aviators",500,300);
//           Employee employee1 = new Employee("Vera","Petrova",350 );
//            Employee employee2 = new Employee("Dzmitry","Loginov",450 );
//            Employee employee3 = new Employee("Kola","Dovi",430 );
//            Employee employee4 = new Employee("Kostia","Sake",450 );
//
//           department.addingToEmployeeList(employee1);
//            department.addingToEmployeeList(employee2);
//            department.addingToEmployeeList(employee3);
//
//
//            session.save(department);

            //удалить

//            //изменить департмент
            Employee employee =session.get(Employee.class,7);
            System.out.println(employee);
            System.out.println("__________________________________________");
            System.out.println(employee.getDepartment());
//            Department department1=session.get(Department.class,6);
//            employee.setDepartment(department1);


//            System.out.println("get Department");
//            Department department=session.get(Department.class,10);
//
//            System.out.println("show Department");
//            System.out.println(department);
//
//            System.out.println("show Department workers");
//            System.out.println(department.getEmployeeList() );

            session.getTransaction().commit();// закрываем новую сессию
            System.out.println("Data was pushed to DB!");
        } finally {
            factory.close();
            session.close();

        }

    }
}