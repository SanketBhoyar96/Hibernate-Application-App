package com.soft;

import java.util.ArrayList;
import java.util.List;

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
     
    	Configuration cnfg = new Configuration();
        cnfg.configure("/com/soft/cnfg/hibernate.cfg.xml");
        SessionFactory factory = cnfg.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Address adress1 = new Address();
        adress1.setAddressID(101);
        adress1.setCity("Nagpur");
        adress1.setPincode(441108);
        adress1.setState("MH");
        
        
        Address adress2 = new Address();
        adress2.setAddressID(201);
        adress2.setCity("Pune");
        adress2.setPincode(331209);
        adress2.setState("MH");
        
        List<Address> addressList = new ArrayList<>();
        addressList.add(adress1);
        addressList.add(adress2);
        
        Student std1 = new Student();
        std1.setStud_ID(11);
        std1.setStud_Name("Sanket");
        std1.setStud_Dept("Manager");
        std1.setAddressList(addressList);
        
        adress1.setStudent(std1);
        adress2.setStudent(std1);
        
//        session.save(adress1);
//        session.save(adress2);
//        session.save(std1);
//        ------------------------------------------------
//        Student student = (Student) session.get(Student.class, 11);
//        System.out.println(student);
//        
//        for(Address adr:student.getAddressList()) {
////        	System.out.println(adr.getAddressID());
//        	System.out.println(adr);
//        }
//        ------------------ORR----------------------
        Address address = (Address) session.get(Address.class, 201);
System.out.println(address);
        
        tx.commit();
    }
}
