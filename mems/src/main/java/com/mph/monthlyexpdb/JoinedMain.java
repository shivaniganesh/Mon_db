package com.mph.monthlyexpdb;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoinedMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
		
		UserTable us= new UserTable();
		
		us.setName(new Name("Sujeet","Kumar"));
		us.setPassword("skm");
		us.setEmail("sujeet.kumar6921@gmail.com");
		us.setPhoneno("8340347726");
		
		

		
		Income in=new Income();
		
		in.setAmount(50000);
		in.setSource("Job");
		in.setBudget(35000);
		
		Expense exp=new Expense();
		Expense exp2=new Expense();
				
				exp.setAmount(1000);
				exp.setCategory("EMI");
				exp.setDescription("car emi");
				exp.setExpDate("02-08-21");
				exp.setIncome(in);
				
				exp2.setAmount(5000);
				exp2.setCategory("electricity");
				exp2.setDescription("3months electricity bill");
				exp2.setExpDate("10-08-21");
				exp2.setIncome(in);
	
		
		List<Expense> elist=new ArrayList<Expense>();
		elist.add(exp2);
		elist.add(exp);
		in.setExpense(elist);
		session.save(in);
		session.save(us);
		session.save(exp);
		session.save(exp2);
		
		session.getTransaction().commit();
		
		System.out.println("Txn completed.");
		
	}

}