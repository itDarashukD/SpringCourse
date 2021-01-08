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
//             Department department = new Department("Builders",1000,500);
//            Employee employee1 = new Employee("Andr","Grek",800 );
//            Employee employee2 = new Employee("Alexander","Zakrevsky",850 );
//
//            department.addingToEmployeeList(employee1);
//            department.addingToEmployeeList(employee2);
//
//            session.save(department);

//            //получить из таблицы
//            Department department = session.get(Department.class,4);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

              //удалить из таблицы
//            //если удать работкина,то толькок он удалиться.т.к. у него нет ссылки на Департамент
//            Employee employee = session.get(Employee.class,2);
//            session.delete(employee);

            //если удать Департамент,то  он удалит и работнка.т.к. у него есть ссылка на него
//            Department department = session.get(Department.class,4);
//            session.delete(department);

            session.getTransaction().commit();// закрываем новую сессию
            System.out.println("Data was pushed to DB!");
        } finally {
            factory.close();
            session.close();

        }

    }
}