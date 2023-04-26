package com.soft;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		Configuration cnfg = new Configuration();
		cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");

		SessionFactory factory = cnfg.buildSessionFactory();

		do {
			System.out.println("Welcome To Hiberante Application");
			System.out.println("===================================================");
			System.out.println("1.Insert Emploee Record");
			System.out.println("2.Update Employee Record");
			System.out.println("3.Retrive Employee Record");
			System.out.println("4.Delete Employee Record");
			System.out.println("===================================================");
			System.out.println("Please Choose Option");
			option=sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the Emp_ID");
				int Emp_ID = sc.nextInt();
				System.out.println("Enter the Emp_Name");
				String Emp_Name = sc.next();
				System.out.println("Enter the Emp_Address");
				String Emp_Address = sc.next();
				System.out.println("Enter the Emp_Salary");
				int Emp_Salary = sc.nextInt();
				Employee emp01 = new Employee(Emp_ID, Emp_Name, Emp_Address, Emp_Salary);
				Session session = factory.openSession();

				Transaction tx = session.beginTransaction();
				session.save(emp01);
				tx.commit();

				break;
			case 2:
				Configuration cnfg02 = new Configuration();
				cnfg02.configure("com/soft/config/hibernate.cfg.xml");

				SessionFactory factory02 = cnfg02.buildSessionFactory();
				
				System.out.println("Enter the Emp_ID");
				int Emp_ID02 = sc.nextInt();
				System.out.println("Enter the Emp_Name");
				String Emp_Name02 = sc.next();
				System.out.println("Enter the Emp_Address");
				String Emp_Address02 = sc.next();
				System.out.println("Enter the Emp_Salary");
				int Emp_Salary02 = sc.nextInt();
				Employee emp02 = new Employee(Emp_ID02, Emp_Name02, Emp_Address02, Emp_Salary02);
				
			     Session session02 = factory02.openSession();
			     Transaction tx02 = session02.beginTransaction();
			     emp02.setID(Emp_ID02);
			     emp02.setName(Emp_Name02);
			     emp02.setAddress(Emp_Address02);
			     emp02.setSalary(Emp_Salary02);
			 	session02.save(emp02);
			     tx02.commit();

				break;
			case 3:
				Session session03 = factory.openSession();
				System.out.println("Enter the studID");
				int Emp_ID03=sc.nextInt();
				Employee emp03 = (Employee) session03.get(Employee.class, Emp_ID03);
			
				System.out.println(emp03);
//				
//
//				Transaction tx03 = session02.beginTransaction();
//				session02.save(emp03);
//				tx03.commit();
				break;
			case 4:
				System.out.println("Enter the Emp_ID");
				int Emp_ID04 = sc.nextInt();
			     Session session04 = factory.openSession();
			     Transaction tx04 = session04.beginTransaction();
			     Employee emp04 = (Employee) session04.get(Employee.class,Emp_ID04);
                   session04.delete(emp04);
                   tx04.commit();
				break;
			case 5:
				System.out.println("==============================================================================");
				break;
				
			default:
				System.out.println("Plz Choose Correct Menu");
				break;
			}

		} while (option != 5);
		  boolean flag = true;
		System.out.println("Thank You for Using Hibernate Application Visit Again....!!!");

	}
}
