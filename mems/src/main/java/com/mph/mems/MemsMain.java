package com.mph.mems;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MemsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
		
		Expense exp= new Expense();
		exp.setAmount(1000);
		exp.setCategory("electricity");
		exp.setDate("03-08-2021");
		exp.setDescription("Last month electricity bill");
		
		
		Income in = new Income();
		in.setAmount(50000);
		in.setSource("job");
		
		
		
		
		User u = new User();
		u.setName(new Fullname("Sujeet","Kumar"));
		u.setEmail("sujeet.kumar6921@gmail.com");
		u.setPassword("skm");
		u.setPhoneno("8340347726");  //as int and long are going out of range
		
		
		
		
		session.save(exp);
		session.save(in);
		session.save(u);
		
		session.getTransaction().commit();
		
		System.out.println("Txn completed.");

	}

}
