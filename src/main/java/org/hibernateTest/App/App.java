package org.hibernateTest.App;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernateTest.Entity.Employee;

import javax.swing.text.html.parser.Entity;
import java.util.List;


public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()  //создаем Фабрику сессий из конфига и класса с БД
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {

            Session session = factory.getCurrentSession();
            session.beginTransaction();// открываем новую сессию

            //   Employee employee = new Employee("Vita21", "Barash21", "Builder", 900);

            //добавить объект в БД
            // session.save(employee);// Сохраняем объект в БД


            //получить Объект из БД
            //  Employee employee1 = session.get(Employee.class, 6);//получение объекта по id
//            System.out.println(employee1);

            //получить всех работников
//            List<Employee>allEmployers = session.createQuery("from Employee").getResultList();//указываем именно Класс, а не Таблицу!!!
//            for (Employee empl:allEmployers
//                 ) {
//                System.out.println(empl);
//            }

            //получить всех работников по запросу
//            List<Employee>allEmployeeWithSomeQuery=session.createQuery("from Employee " +
//                    "where name='Andrey'and salary > 1000").getResultList();
//
//            for (Employee allWhoAndrey:allEmployeeWithSomeQuery
//            ) {
//                System.out.println(allWhoAndrey);
//            }

            //update по id
//            Employee employee1 = session.get(Employee.class, 1);
//            employee1.setSalary(2000);
//            employee1.setSurname("Петров");

            //update по запросу
            // session.createQuery("update Employee set name = 'Sawa', surname = 'Kizuk',salary=1550 where id=7").executeUpdate();


            //delete по id
//            Employee employee1 = session.get(Employee.class,1);
//            session.delete(employee1);

//            //delete по запросу
//            session.createQuery("delete from Employee where name='Vita'").executeUpdate();


            session.getTransaction().commit();// закрываем новую сессию

            System.out.println("Data was pushed to DB!");
        } finally {
            factory.close();
        }


    }
}
