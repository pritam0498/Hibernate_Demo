package com.sp.hibernate.hibernate_demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sp.hibernate.hibernate_demo.entity.Song;
import com.sp.hibernate.hibernate_demo.utils.SessionFactoryUtility;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    SessionFactory sessionFactory = SessionFactoryUtility.getSessionFactory();
    
    Session session = sessionFactory.openSession();
    
    Song song = new Song(5, "Channa mereya", "Arjit Singh");
    
    session.beginTransaction();
    
//    session.beginTransaction().begin();
    session.saveOrUpdate(song);
    
//    session.update(song);
    session.getTransaction().commit();
    System.out.println("Data saved.. check db");
    session.close();
    
  }
}
