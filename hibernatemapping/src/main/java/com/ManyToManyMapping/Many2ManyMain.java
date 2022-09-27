package com.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2ManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Project p1=new Project();
		p1.setPid(101);
		p1.setPname("deeksha");
		Project p2=new Project();
		p2.setPid(102);
		p2.setPname("revathi");
		Employee1 e1=new Employee1();
	    e1.setEid(201);
	    e1.setEname("sarika");
	    e1.setSalary(50000);
		Employee1 e2=new Employee1();
		e2.setEid(202);
        e2.setEname("manju");
        e2.setSalary(60000);
        List<Employee1>l1=new ArrayList<Employee1>();
        List<Project>l2=new ArrayList<Project>();
        l1.add(e1);
        l1.add(e2);
        l2.add(p1);
        l2.add(p2);
        p2.setEmp(l1);
        e1.setProject(l2);
        Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		tx.commit();
		s.close();
        

        
	}

}
