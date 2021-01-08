package org.hibernate_one_to_mani_uni_derectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate_one_to_mani_uni_derectional.Entity.Department;
import org.hibernate_one_to_mani_uni_derectional.Entity.Employee;


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

            //Добавить в таблицу
//             Department department = new Department("IT",5000,2500);
//            Employee employee1 = new Employee("Alex","MRZ",2700 );
//            Employee employee2 = new Employee("Vicktor","Baras",1000 );
//
//            department.addingToEmployeeList(employee1);
//            department.addingToEmployeeList(employee2);
//
//            session.save(department);

            //Получить всех из таблицы
//            Department department = session.get(Department.class,2);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

            //Удалить
            //этими способами удалятся все работники т.к. cascade = CascadeType.ALL
            //удаление одного раба потянет удаление департамента - а оно потянет удаление второго раба
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
            //удаление департамента = удаление всех воих рабов
//            Department department = session.get(Department.class, 3);
//            session.delete(department);
            //Чтбы норм.удалялось меняем cascade = CascadeType.ALL на другие значения тольео не REMOVE=CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST
//            Employee employee = session.get(Employee.class,3);
//            session.delete(employee);


            session.getTransaction().commit();// закрываем новую сессию
            System.out.println("Data was pushed to DB!");
        } finally {
            factory.close();
            session.close();

        }

    }
}