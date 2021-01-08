package org.hibernateTest2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernateTest2.Entity.Detail;
import org.hibernateTest2.Entity.Employee;


import javax.swing.text.html.parser.Entity;
import java.util.List;


public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()  //создаем Фабрику сессий из конфига и класса с БД
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Employee employee = new Employee("Vital", "qwe", "It", 1000);
        Detail detail = new Detail("Grodno", 5555552, "Vit@tut.by");

        Session session = factory.getCurrentSession();
        session.beginTransaction();// открываем новую сессию

        //Uni-directional
        employee.setDetail(detail);  //внедрили detail в employee
        //теперь можно выполнять операции(они будут выполняться сразу для 2х Табл. т.к.  @OneToOne(cascade = CascadeType.ALL) )

        //Bi-directional(объекты сслылаются друг на друга)
//        employee.setDetail(detail);
//        detail.setEmployee(employee);
//        //методы все теже что и для //Uni-directional
//        //разорвать связь
//        Detail detail1 = session.get(Detail.class,3);
//        detail1.getEmployee().setDetail(null);

        try {
            //добавить в 2 таблицы
            //    session.save(employee);

            //получить по id
            // Employee employee1 = session.get(Employee.class,7);
//            System.out.println(employee1);                  //выводим нашу табл(наш Об)
//           System.out.println(employee1.getDetail());      //выводим вторую связанную таблицу(связанный Об)

            //удалить по id
            //   Employee employee1 = session.get(Employee.class, 2);
            //   session.delete(employee1);

            //удалить по запросу
            //    session.createQuery("delete from Detail where id=5").executeUpdate();


            session.getTransaction().commit();// закрываем новую сессию
            System.out.println("Data was pushed to DB!");
        } finally {
            factory.close();
            session.close();

        }

    }
//        Employee employee = new Employee("Dzmitry","Darashuk","IT",3500);
//        Detail detail = new Detail("Grodno",7827569,"Dd@tut.by");
//
//        employee.setDetail(detail);  //внедрили detail в employee
//        //теперь можно выполнять операции(они будут выполняться сразу для 2х Табл. т.к.  @OneToOne(cascade = CascadeType.ALL) )
//
//        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();// открываем новую сессию
//
//            session.save(employee);
//
//            session.getTransaction().commit();// закрываем новую сессию
//            System.out.println("Data was pushed to DB!");
//        } finally {
//            factory.close();
//        }
//
//
//    }
}
