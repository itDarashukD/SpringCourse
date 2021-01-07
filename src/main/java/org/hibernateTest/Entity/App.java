package org.hibernateTest.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {


            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Andrey", "Kizuk", "It Repair", 1000);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
        System.out.println("Data was pushed to DB!");

    }
}
