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
        
        Address ad1 = new Address();
        ad1.setAddressID(121);
        ad1.setCity("Nagpur");
        ad1.setPincode(221322);
        ad1.setState("MH");
        
        Address ad2 = new Address();
        ad2.setAddressID(122);
        ad2.setCity("Hydrabad");
        ad2.setPincode(442312);
        ad2.setState("AP");
        
        Student st1 = new Student();
        st1.setStud_ID(111);
        st1.setStud_Name("Sanket");
        st1.setStud_Dept("Devops");
        
        Student st2 = new Student();
        st2.setStud_ID(112);
        st2.setStud_Name("Marry");
        st2.setStud_Dept("Engineer");
        
        List<Address> adrList = new ArrayList<>();
        adrList.add(ad1);
//        adrList.add(ad2);
        
        List<Student> stdList = new ArrayList<>();
        stdList.add(st1);
//        stdList.add(st2);
        
         ad1.setStdList(stdList);
         ad2.setStdList(stdList);
        st1.setAddressList(adrList);
        st2.setAddressList(adrList);
        
        session.save(ad1);
        session.save(ad2);
        session.save(st1);
        session.save(st2);
        tx.commit();
    }
}
