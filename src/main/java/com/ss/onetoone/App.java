package com.ss.onetoone;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		SessionFactory sessionFactory = getSessionFactory();
		Session ses = sessionFactory.openSession();
		List<Root1> l=ses.createCriteria(Root.class).list();

		for(Root1 r:l) {
			ses.save(r);
		}
		/* 
		 * try { URL url = new URL("http://52.66.191.117/response"); List<Root> apis =
		 * Arrays.asList(new ObjectMapper().readValue(url, Root[].class));
		 * System.out.println(apis.size()); Transaction ts = ses.beginTransaction(); int
		 * count=1; for (Root r : apis) { ses.save(r); if(count%10000==0) ses.flush(); }
		 * ts.commit(); } catch (Exception e) { e.printStackTrace(); }
		 */

		/*Person p = new Person();
		p.setFirstName("ss");
		p.setLastName("ss");
		Address a = new Address();
		a.setCountry("IN");
		a.setHno("1223");
		Serializable ser=ses.save(p);
		System.out.println(ser);
		ses.beginTransaction().commit();
	*/
	}
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {

				StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
				
				 sessionFactory=meta.getSessionFactoryBuilder().build();	
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
		}
		return sessionFactory;
	}
}
