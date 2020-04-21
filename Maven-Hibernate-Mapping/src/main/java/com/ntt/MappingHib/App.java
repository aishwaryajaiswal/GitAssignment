package com.ntt.MappingHib;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setLanme("dell");
		laptop.setLid(101);

		Student s = new Student();
		s.setName("AJ");
		s.setRollno(1);
		s.setMarks(50);
		// s.setLaptop(laptop);
		// s.getLaptop().add(laptop);

		// laptop.getStudent().add(s);

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		session.beginTransaction();

		Person s1 = session.get(Person.class, 1);// to fetch the data eagerly
		System.out.println(s1.getName());

		/*
		 * Collection<Laptop> laps=s1.getlaps();
		 * 
		 * for(Laptop l: laps) { System.out.println(l); }
		 */

		session.save(s);
		session.save(laptop);
		session.getTransaction().commit();

	}
}
