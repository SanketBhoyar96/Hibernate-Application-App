package com.soft;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		int option;
		Configuration cnfg = new Configuration();
		cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");

		SessionFactory factory = cnfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
				
//  =========================================Delete By name======================================================
		Query query = session.createQuery("delete Employee where empName=:empName");
		query.setParameter("empName", "akki");
		int name= query.executeUpdate();
		tx.commit();
// 
//=========================================Count Employee======================================================
//		Query query = session.createQuery("select count(EmpId) from Employee");
//		List<Integer>total=query.list();
//		System.out.println(total);
		
//=========================================sum of Employee Salary======================================================
//				Query query = session.createQuery("select sum(empSal) from Employee");
//				
//				List<Integer>total=query.list();
//				System.out.println(total);
				
//=========================================Max Salary of Employee======================================================
//				Query query = session.createQuery("select max(empSal) from Employee");
//				
//				List<Integer>total=query.list();
//				System.out.println(total);
				
//=========================================Second Higest salary of Emp ======================================================
//				Query query = session.createQuery("select max(empSal) from Employee where empSal<(select max(empSal) from Employee)");
//				
//				List<Integer>total=query.list();
//				System.out.println(total);
		
//=========================================Update By Name Employee======================================================
//		Query query = session.createQuery("update Employee set empName=:Name where empName=:i");
//		
//		query.setParameter("Name", "Sanket");
//		query.setParameter("i", "sank");
//		int total= query.executeUpdate();
//		System.out.println(total);
//		tx.commit();
//=========================================Retrive Table data======================================================
//		Query query = session.createQuery("from Employee");
		
//		List<Integer>total=query.list();
//		System.out.println(total);
//		=========================================Avg salary======================================================
//		Query query = session.createQuery("select avg(empSal) from Employee");
////		
//		List<Integer>total=query.list();
//		System.out.println(total);
		
//		/Hql Query
//      System.out.println("=======Retrive=======");
//      
//      String hql ="from Employee where empName = :empName";
//      
//      Query query = session.createQuery(hql);
//      
//      query.setParameter("empName", "sakshi");
//      
//      List result =query.list();
//      
//      System.out.println(result);
//      
//      tx.commit();
    }
}
			