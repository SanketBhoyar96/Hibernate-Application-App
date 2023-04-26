package com.soft.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {

	
	public static SessionFactory getConnection() {
		Configuration cnfg = new Configuration();
		cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");
		SessionFactory factory = cnfg.buildSessionFactory();
		return factory;
	}
}
