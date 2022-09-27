package com.aggregate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Workermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    
    /*  Worker w=new Worker();
       w.setWid(101);
       w.setWname("Deeksha");
       w.setCity("hyd");
       w.setAge(21);
       w.setSalary(50000);
       
       w.setWid(102);       
       w.setWname("Revathi");
       w.setCity("adhilabad");
       w.setAge(21);
       w.setSalary(50000);
       Trainer t=new Trainer();
       t.setTid(101);
       t.setTname("pooja mam");
       t.setTid(102);
       t.setTname("manasa");*/
     /*   Query q1=s.createQuery("from Worker");
       List list=q1.list();*/
      Query q1=s.createQuery("update Worker set salary=:salary where Wid=:Wid ");
       q1.setDouble("salary",80000);
       q1.setParameter("Wid", 1);
       int res=q1.executeUpdate();
       System.out.println("updating queries of Worker fields="+res);
      /* System.out.println("delete query");
       Query q=s.createQuery("delete from Worker where Wid=3");
       q.executeUpdate();*/
     /*  System.out.println("group by query");
        Query q1=s.createQuery("select count(*),City from Worker group by City");
        List<Object[]>w1=q1.list();
        for(Object[] arr:w1) {
        	System.out.println(Arrays.toString(arr));
        }*/
	  /* System.out.println("group by query");
        Query q1=s.createQuery("select Wname,SUM(salary)from Worker GROUP BY Wname");
        List<Object[]>w1=q1.list();
        for(Object[] arr:w1) {
        	System.out.println(Arrays.toString(arr));
        }*/
	   /* System.out.println("group by query");
        Query q1=s.createQuery("select Wname,sum(salary)from Worker group by Wname having sum(salary)>=50000");
        List<Object[]>w1=q1.list();
        for(Object[] arr:w1) {
        	System.out.println(Arrays.toString(arr));
        }*/
        
       // q1.executeUpdate();

       
       		   /*  System.out.println("sum in aggregate function");
       Query q1=s.createQuery("select sum(salary)from Worker");
       double sumSalary=(Double)q1.uniqueResult();
        System.out.println("sum="+sumSalary);
       // System.out.println("min in aggregate function");
       /* Query q2=s.createQuery("select min(salary)from Worker");
        // int sumId=(Integer)q1.uniqueResult();
         System.out.println("min="+q2.list().get(0));*/
         
       /*  System.out.println("max in aggregate function");
         Query q3=s.createQuery("select max(salary)from Worker");
         // int sumId=(Integer)q1.uniqueResult();
          System.out.println("max="+q3.list().get(0));
          System.out.println("count with salary in aggregate function");*/
         /* Query q4=s.createQuery("select count(salary)from Worker");
          // int sumId=(Integer)q1.uniqueResult();
           System.out.println("count="+q4.list().get(0));*/
          /* System.out.println("count * in aggregate function");
           Query q5=s.createQuery("select count(*)from Worker");
           // int sumId=(Integer)q1.uniqueResult();
            System.out.println("count="+q5.list().get(0));*/
            
           
     //  s.save(t);   
       //s.save(w);
       tx.commit();
       s.close();
   	sf.close();

	}

}
