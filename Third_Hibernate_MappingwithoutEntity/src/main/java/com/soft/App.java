package com.soft;

import java.util.Scanner;

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
       
    	Address address = new Address(441108,"Nagpur","MH");
    	
    	Student student = new Student();
    	student.setStud_ID(100);
    	student.setStud_Name("Amisha");
    	student.setStud_Dept("Mechanical");
    	student.setAddress(address);
    	
		Configuration cnfg = new Configuration();
		cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");

		SessionFactory factory = cnfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(student);
//		================================================
		Student std1 = (Student) session.get(Student.class, 100);
		System.out.println(std1);
//		================================================
		
		tx.commit();
    }
}
