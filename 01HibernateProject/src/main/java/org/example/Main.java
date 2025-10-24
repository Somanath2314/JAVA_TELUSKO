package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setsName("Somanath");
//        s1.setsAge(20);
//        s1.setRollNo(192);

        // we will build up the things from the bottom to the top
        // inorder to connect ur application to the DB -> We need the session
        // So inorder to create the session there will be session factory who helps you to create one
        // Now for the sessionFactory -> it needs to be taken permissions from the govt, so there exists one
        // configuration, so using this configurations sessionFactories are built, and using sessionFactories
        // sessions are built
        // so from the session we can save our student data -> session.save(s1), newer version is session.persist(s1)


        // Now i need to give the DB configs right, so think of how to connect

        //1. there are two ways, using xml and using the annotations
//        Configuration cfg = new Configuration();
        //using xml, configure('fileName inside resources folder') else save with hibernate.cfg.xml
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure("hibernate.cfg.xml");

//        SessionFactory factory = cfg.buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();


        //Lets fetch the values!
//        Student s2 = session.find(Student.class, 196);
//        System.out.println(s2);


        //Lets work with update values
        //lets update this persons age to 50
//        s1.setsName("Somanath");
//        s1.setsAge(50);
//        s1.setRollNo(192);

//        we are changing data -> so needs to use the transacion
//        Transaction transaction = session.beginTransaction();
//        if data is there it will update, else it will create the new row!
//        session.merge(s1);
//        transaction.commit();
//
//        session.close();
//        factory.close();
//        s1 = session.find(Student.class, 196);
//        //lets try the deletion
//        session.remove(s1); //needs the object (But if you dont have the obj?, first fetch using id, then pass it here
//        transaction.commit();



//        -----------------------------Now lets fully work with the alien-------------
//        Alien alien = new Alien();
//        alien.setAid(1);
//        alien.setAge(10);
//        alien.setAname("Soman");
//        alien.setTech("Java");
//
//        Configuration cf = new Configuration();
//        cf.addAnnotatedClass(org.example.Alien.class);
//        cf.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cf.buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Transaction tran = session1.beginTransaction();
//        session1.persist(alien);
//        tran.commit();

        //        ----------------------------How things work when we add the laptop class inside alien-------------
// before alien_name, alien_age, alien----
//        but embeddings are added to just come and expand the num of cols
//        like aliend_name, aliend_age, alien---, brand, ram etc

//        Laptop lap = new Laptop();
//        lap.setRam(10);
//        lap.setLid(1);
//        lap.setBrandName("Dell");
//
//        Alien alien = new Alien();
//        alien.setAid(1);
//        alien.setAge(10);
//        alien.setAname("Soman");
//        alien.setTech("Java");
//        alien.setLaptop(lap);
//
//        Configuration cf = new Configuration();
//        cf.addAnnotatedClass(org.example.Alien.class);
//        cf.addAnnotatedClass(org.example.Laptop.class);
//        cf.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cf.buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Transaction tran = session1.beginTransaction();
//        session1.persist(lap);
//        session1.persist(alien);
//        tran.commit();


        //        ----------------------------Mapping One to Many-------------

//        Laptop lap = new Laptop();
//        lap.setRam(10);
//        lap.setLid(1);
//        lap.setBrandName("Dell");
//
//        Laptop lap1 = new Laptop();
//        lap1.setRam(11);
//        lap1.setLid(2);
//        lap1.setBrandName("Macbook");
//
//        Alien alien = new Alien();
//        alien.setAid(1);
//        alien.setAge(10);
//        alien.setAname("Soman");
//        alien.setTech("Java");
//        lap.setAlien(alien);
//        lap1.setAlien(alien);
//        alien.setLaptop(Arrays.asList(lap, lap1));
//
//        Configuration cf = new Configuration();
//        cf.addAnnotatedClass(org.example.Alien.class);
//        cf.addAnnotatedClass(org.example.Laptop.class);
//        cf.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cf.buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Transaction tran = session1.beginTransaction();
//        session1.persist(lap);
//        session1.persist(lap1);
//        session1.persist(alien);
//        tran.commit();
//        Session session2 = sessionFactory.openSession();
//        Alien a5 = session2.find(Alien.class, 1);
//        System.out.println(a5);

        //        ----------------------------Mapping many to Many-------------


//        Laptop lap = new Laptop();
//        lap.setRam(10);
//        lap.setLid(1);
//        lap.setBrandName("Dell");
//
//        Laptop lap1 = new Laptop();
//        lap.setRam(11);
//        lap.setLid(2);
//        lap.setBrandName("Macbook");
//
//        Laptop lap3 = new Laptop();
//        lap3.setRam(12);
//        lap3.setLid(5);
//        lap3.setBrandName("Asus");
//
//        Alien alien = new Alien();
//        alien.setAid(1);
//        alien.setAge(10);
//        alien.setAname("Soman");
//        alien.setTech("Java");
//
//        Alien a1 = new Alien();
//        a1.setAid(2);
//        a1.setAge(10);
//        a1.setAname("Manju");
//        a1.setTech("Python");
//
//        alien.setLaptop(Arrays.asList(lap, lap1));
//        a1.setLaptop(Arrays.asList(lap1, lap3));
//
//        lap.setAliens(Arrays.asList(alien));
//        lap1.setAliens(Arrays.asList(alien, a1));
//        lap3.setAliens(Arrays.asList(a1));
//
//        Configuration cf = new Configuration();
//        cf.addAnnotatedClass(org.example.Alien.class);
//        cf.addAnnotatedClass(org.example.Laptop.class);
//        cf.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = cf.buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        Transaction tran = session1.beginTransaction();
//        session1.persist(lap);
//        session1.persist(lap1);
//        session1.persist(lap3);
//        session1.persist(alien);
//        session1.persist(a1);
//        tran.commit();


        //        ----------------------------Learning HQL (Hybernate Query Language)-------------

        Student s1 = new Student();
        s1.setsAge(6);
        s1.setsName("susheel");
        s1.setRollNo(200);

        Configuration cof = new Configuration();
        cof.addAnnotatedClass(org.example.Student.class);
        cof.configure("hibernate.cfg.xml");

        SessionFactory factory = cof.buildSessionFactory();
        Session session = factory.openSession();
//        Transaction tran = session.beginTransaction();
//        session.persist(s1);
//        tran.commit();

//        Now lets HQL here
//        Student stu = session.find(Student.class, 196);
//        System.out.println(stu);

//        If you want to print all the students whose usn >= 200
//        select * from student where rollno>= 200 -> SQL
//        from Student where rollNo>=200 -> HQL

        Query query = session.createQuery("From Student where rollNo>=200");
        List<Student> studentList = query.getResultList();
        System.out.println(studentList);

    }
}