package com.doctor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Doctormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Doctor d=new Doctor();
SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session s = sf.openSession();
Transaction tx = s.beginTransaction();
Criteria criteria=s.createCriteria(Doctor.class);
List<Doctor>d11=criteria.list();
for(Doctor doc:d11) {
	System.out.println("Id="+doc.getDid()+",name="+doc.getDname());
	
}

Doctor doc=new Doctor();
//doc.setDid(301);
//doc.setDname("deeksha");
Doctor d1=new Doctor();
Doctor d2=new Doctor();
Doctor d3=new Doctor();
Doctor d4=new Doctor();
d1.setDname("deeksha");
d2.setDname("dinesh");
d3.setDname("manju");
d4.setDname("siri");




s.save(d1);
s.save(d2);
s.save(d3);
s.save(d4);

tx.commit();
s.close();
sf.close();

	}

}
