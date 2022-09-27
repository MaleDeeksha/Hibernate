package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    Department d=new Department();
	    d.setD_id(102);
	    d.setDname("ece");
	    Employee e=new Employee();
	    e.setEid(202);
	    e.setEname("revathi");
	    e.setEaddress("adhilabad");
	    e.setNumber(99121093);
	    List<Employee>li=new ArrayList<Employee>();
	    li.add(e);
	    d.setEmp(li);
	    e.setDept(d);
	    s.save(e);
		s.save(d);
		tx.commit();
		s.close();
		sf.close();

	    
	}

}
