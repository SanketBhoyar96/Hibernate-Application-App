package com.soft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Address;
import com.soft.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Address address= new Address(11, 44108,"Pune","MH");
       
       Student student = new Student(1, "Sanket","FrontEnd", address);

		Configuration cnfg = new Configuration();
		cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");

		SessionFactory factory = cnfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();  
		
		session.save(student);
		session.save(address);
		tx.commit();
    }
}
