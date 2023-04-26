package com.soft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    	 Configuration cnfg = new Configuration();
         cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");
         
         SessionFactory factory = cnfg.buildSessionFactory();
         
         Employee emp = new Employee();
         emp.setEmpID(102);
         emp.setEmpName("Sanket");
         emp.setEmpDep("Front_End_Developer");
         emp.setEmpSalary(10000);
         
         
         Session session = factory.openSession();
         
         Transaction tx = session.beginTransaction();
         session.save(emp);
         tx.commit();
         
    }
}
