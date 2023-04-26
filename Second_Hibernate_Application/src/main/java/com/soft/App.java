package com.soft;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cnfg= new Configuration();
       cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");
       
       SessionFactory factory =cnfg.buildSessionFactory();
       
//       =========================================================================================================
       
//                      user input using
//       
//       Scanner sc= new Scanner(System.in);
//       System.out.println("Enter the studID");
//       int Stud_ID=sc.nextInt();
//       System.out.println("Enter the Stud_Name");
//       String Stud_Name=sc.next();
//       System.out.println("Enter the stud_Address");
//       String Stud_Address=sc.next();
//       System.out.println("Enter the stud_Divsion");
//       String Stud_Divsion=sc.next();
       
//       Student student = new Student(Stud_ID,Stud_Name,Stud_Address,Stud_Divsion);
       
//                  Static data without User input
//       Student student= new Student();
//       student.setID(102);
//       student.setName("Sanket");
//       student.setAddress("Nagpur");
//       student.setDivision("A");
       
//       Session session = factory.openSession();
//       Transaction tx = session.beginTransaction();
//       session.save(student);
//       tx.commit();
//       =====================================================================================================================
//     Session session = factory.openSession();
//     Transaction tx = session.beginTransaction();
     
//       ---------------------------------------------------11----------------------------------------------------
                          //  Retrive data
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the studID");
//     int Stud_ID=sc.nextInt();
//     Student student = (Student) session.get(Student.class, Stud_ID);
//     System.out.println(student);
//     -------------------------------------------------------------------------------------------------------
                         // Delete data record
//     session.delete(student);
//     --------------------------------------------------------------------------------------------------
                            // update record
//     student.setAddress("Amravti");
//     student.setDivision("C");
//     session.save(student);
     
//     tx.commit();
       
//       =============================================================================================================================
     Session session = factory.openSession();
     Transaction tx = session.beginTransaction();
  
     tx.commit();
       
       
    }
}
