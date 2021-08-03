package com.mph.mappedclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappedMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Expense exp = new Expense();
		exp.setUserId(100);
		exp.setAmount(1000);
		exp.setCategory("EMI");
		exp.setDescription("car emi");
		exp.setExpDate("02-08-21");

		Income in = new Income();
		in.setUserId(12);
		in.setAmount(50000);
		in.setSource("Job");
		in.setExp(exp);

		UserTable us = new UserTable();
		us.setUserId(10);
		us.setName(new Name("Sujeet", "Kumar"));
		us.setPassword("skm");
		us.setEmail("sujeet.kumar6921@gmail.com");

		us.setPhoneno("8340347726");


		session.save(us);
		session.save(exp);
		session.save(in);

		session.getTransaction().commit();

		System.out.println("Txn completed.");

	}

}