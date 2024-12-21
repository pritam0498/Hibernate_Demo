package com.sp.hibernate.hibernate_demo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sp.hibernate.hibernate_demo.entity.Song;

public class SessionFactoryUtility {
	
	public static SessionFactory getSessionFactory() {
		
	    Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    configuration.addAnnotatedClass(Song.class);
	    
	    SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
		
	}

}
