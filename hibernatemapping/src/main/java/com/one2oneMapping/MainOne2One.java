package com.one2oneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOne2One {
public static void main(String args[]) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
    
	Que q=new Que();
	q.setId(26);
	q.setQ_name("what is JDK ");
	Ans a=new Ans();
	//a.setA_id(505);
	//a.getA_solution("deeksha");
	a.setA_id(507);
	a.setA_solution("java development kit");
	q.setA_id(a);
	s.save(q);
	s.save(a);
	tx.commit();
	s.close();
	sf.close();
}
	}
