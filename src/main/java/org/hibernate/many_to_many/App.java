package org.hibernate.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.many_to_many.Entity.Child;
import org.hibernate.many_to_many.Entity.Section;


public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

//        Section section = new Section("Football");
//        Child child1 = new Child("Dima", 5);
//        Child child2 = new Child("Vika", 7);
//        Child child3 = new Child("Vlad", 6);
//
//        section.addChildsToSection(child1);
//        section.addChildsToSection(child2);
//        section.addChildsToSection(child3);

//        Section section2 = new Section("chess");
//        Section section3 = new Section("volleyball");
//        Section section4 = new Section("snooker");
//        Child child4 = new Child("Nastia", 10);
//
//        child4.addSectionToChild(section2);
//        child4.addSectionToChild(section3);
//        child4.addSectionToChild(section4);

        Session session = null;

        try {
            session = factory.getCurrentSession();

            session.beginTransaction();

            //add
//            session.save(section);
//            session.save(child4);
//            session.persist(child4);//вместо save() - persist() если CascadeType.не ALL, а другой

            //GetByID
            //bySection
//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildList());
//            //byChild
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSectionList());

            //Delete   //нужно менять CascadeType.ALL, иначе по секции удалит всех ее детей
            //bySection
//            Section section = session.get(Section.class,5);
//            session.delete(section);

            //Delete   //нужно менять CascadeType.ALL, иначе по child удалит всех ее детей
            //byChild
            Child child=session.get(Child.class,4);
            session.delete(child);


            session.getTransaction().commit();


            System.out.println("Data was pushed to DB!");
        } catch (Exception e) {
            System.out.println("exeption" + e);


        } finally {
            session.close();
            factory.close();

        }


    }
}
