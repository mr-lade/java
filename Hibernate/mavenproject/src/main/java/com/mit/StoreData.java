package com.mit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
public static void main(String[] args) {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Employee e1 = new Employee();
	e1.setId(100);
	e1.setFirstname("MIT");
	e1.setLastname("AOE");
	session.save(e1);
	t.commit();
	System.out.println("Data Saved Successfully");
	factory.close();
	session.close();
	
}
}
