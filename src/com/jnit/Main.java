package com.jnit;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Vendor v=new Vendor();
		v.setVid(101);
		v.setVname("Amazon");
		
		Customer rahul = new Customer();
		rahul.setCid(1023);
		rahul.setCname("rahul");
		
		Customer shiva=new Customer();
		shiva.setCid(1024);
		shiva.setCname("shiva");
		
		Set s = new HashSet();
		s.add(rahul);
		s.add(shiva);
		
		v.setRow(s);
		
		session.save(v);
		
		
		transaction.commit();
		session.close();
		
	} 



	}


