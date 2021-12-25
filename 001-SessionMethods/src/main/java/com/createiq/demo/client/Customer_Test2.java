package com.createiq.demo.client;


import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.createiq.demo.model.Customer;

public class Customer_Test2 {
	
	public static void main(String[] args) {
		
		Configuration  configuration = new Configuration();
		configuration.configure();
		SessionFactory  sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		System.out.println(session);
//		Customer customer = new Customer("Sukanya Pamuluru ", 180, 6600.00);
//		session.save(customer);
//		session.beginTransaction().commit();
//		session.close();
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//		CriteriaQuery<Integer> criteriaQuery = criteriaBuilder.createQuery(Integer.class);
//		Root<Customer> root = criteriaQuery.from(Customer.class);
//		criteriaQuery.select(root.get("c_id"));
//		Query<Integer> query = session.createQuery(criteriaQuery);
//		List< Integer> list = query.getResultList();
//		
//		list.forEach(System.out::println);
//		
//		CriteriaQuery< String > criteriaQuery2 = criteriaBuilder.createQuery(String.class);
//		Root<Customer> root2 = criteriaQuery2.from(Customer.class);
//		criteriaQuery2.select(root2.get("cname"));
//		Query<String>  query2 = session.createQuery(criteriaQuery2);
//		List<String> list2 = query2.getResultList();
//		list2.forEach(System.out:: println);
//		
//		CriteriaQuery< Object [] > criteriaQuery3 = criteriaBuilder.createQuery(Object[].class);
//		Root<Customer> root3 = criteriaQuery3.from(Customer.class);
//		criteriaQuery3.multiselect(root3.get("c_id"),root3.get("cname"));
//		Query<Object[]>  query3 = session.createQuery(criteriaQuery3);
//		List<Object[]> list3 = query3.getResultList();
//		list3.forEach(action -> {
//			System.out.println(action[0]+" "+action[1]);
//		});
//		CriteriaQuery<Object[]> criteriaQuery4 = criteriaBuilder.createQuery(Object[].class);
//		Root<Customer> root4 = criteriaQuery4.from(Customer.class);
//		criteriaQuery4.multiselect(root4.get("c_id"),root4.get("cname"),root4.get("buyingqty"),root4.get("amount"));
//		Query<Object[]> query4  = session.createQuery(criteriaQuery4);
//		List<Object[]> list4 = query4.getResultList();
//		list4.forEach(action -> {
//			System.out.println(action[0]+"   "+action[1]+"   "+action[2]+"   "+action[3]);
//		});
		
//		NativeQuery<Object[]> nativeQuery = session.createNativeQuery("SELECT * FROM CUSTOMER");
////		Root<Customer> root6 = nativeQuery.fo
//		List<Object[]> list = nativeQuery.list();
//		list.forEach(action -> {
//			System.out.println(action[0]+"   "+action[1]+"   "+action[2]);
//		});
		session.beginTransaction();
//		NativeQuery<Integer > nativeQuery2 = session.createNativeQuery("DELETE FROM SUPERMARKET WHERE C_ID = 9");
////		List< Integer > list2 = nativeQuery2.getResultList();
////		session.beginTransaction();
//		nativeQuery2.executeUpdate();
//		session.getTransaction().commit();
		
//		NativeQuery< Object[]>  nativeQuery = session.createNativeQuery("SELECT * FROM SUPERMARKET");
//		List<Object[]>  list = nativeQuery.getResultList();
//		list.forEach(action -> {
//			System.out.println(action[0]+"    "+action[1]+"     "+action[2]);
//		});
//		
//		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
//		Root<Customer> root = criteriaQuery.from(Customer.class);
//		criteriaQuery.multiselect(root.get("c_id"),root.get("cname"),root.get("buyingqty"),root.get("amount"));
//		Query<Object[]> query = session.createQuery(criteriaQuery);
//		List<Object[]> list2 = query.getResultList();
//		list2.forEach(action -> {
//			
//		});
		
		List<Object[]> customers = session.createNamedQuery("get_all").list();
		customers.forEach(System.out::println);
		
//		Query<Object[]> query2 = session.createNamedQuery("get_all");
//		List<Object[]> list = query2.getResultList();
		
	}

}
