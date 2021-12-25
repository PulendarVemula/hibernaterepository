package com.createiq.demo.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.demo.model.Customer;

public class Customer_Test {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println(session);
//		session.merge(customer);
//      Customer customer = session.get(Customer.class, 3);
//		Customer customer = new Customer();
//		customer.setC_id(3);
//		customer.setCname("Samatha Avudari");
//		customer.setBuyingqty(500);
//		customer.setAmount(6000.00);
//		
//		
//		String name = "select c_id from Customer";
//	  Query< Integer>  query = session.createQuery(name);
//		
//	  List<Integer>customers = query.list();
//	  
//	  customers.forEach(System.out::println);
//		session.beginTransaction().commit();
		
//		   System.out.println(customer2);
		
		
//		
		
//		 String delete = "delete from Customer where c_id = '1'";
//		 session.beginTransaction();
//	     Query query2 = session.createQuery(delete);
//		 query2.executeUpdate();
//		 session.getTransaction().commit();
//		 session.close();
	}
}
