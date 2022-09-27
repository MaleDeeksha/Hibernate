package com.hibernate.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.doctor.Doctor;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        //aggregate operations
        //count(*)
        //count(id)
        //max
        //min
        //sum
      /* Query q1=s.createQuery("select min(B_id)from SbiBank");
       // int sumId=(Integer)q1.uniqueResult();
        System.out.println("min="+q1.list().get(0));*/
      /*  sum query
       Query q1=s.createQuery("select sum(B_id)from SbiBank");
        int sumId=(Integer)q1.uniqueResult();
         System.out.println("sum="+sumId);*/

       /* Query q1=s.createQuery(" delete SbiBank where B_id=:B_id ");
      //  q1.setParameter("Name","sbi");
        q1.setParameter("B_id", 4);
        int result=q1.executeDelete();
        System.out.println("delete queries of SbiBank fields="+result);*/
    
        //update query
        Query q1=s.createQuery("update SbiBank set Name=:Name where B_id=:B_id ");
        q1.setParameter("Name","union");
        q1.setParameter("B_id", 1);
        int result=q1.executeUpdate();
        System.out.println("updating queries of SbiBank fields="+result);
     /*   Criteria criteria=s.createCriteria(SbiBank.class);
        List<SbiBank>s11=criteria.list();
        for(SbiBank sl:s11) {
        	System.out.println("Id="+sl.getB_id()+"name="+sl.getName());
        	
        }*/
       /* long count = (Long) s.createCriteria(SbiBank.class)
				.setProjection(Projections.rowCount())
				.add(Restrictions.like("name", "%i%"))
				.uniqueResult();
		System.out.println("Number of sbibanks with 'i' in name="+count);*/
      /*  s11 = s.createCriteria(SbiBank.class)
				.add(Restrictions.like("name", "%o%"))
				.list();
		for(SbiBank sl1 : s11){
			System.out.println("sbibank having 'i' in name::"+sl1.getB_id()+","+sl1.getName());
		}
         */
			/*Query q=s.getNamedQuery("findSbiBankById");
		q.setInteger("Id1",3);
		List<SbiBank>sl=q.list();
		for(int i=0;i<sl.size();i++) {
			System.out.println("name"+sl.get(i).getName());
		System.out.println("count>>>>"+sl.size());
		if(!sl.isEmpty()) {
			SbiBank sb=(SbiBank)sl.get(0);
			System.out.println(">>>>>>"+sb);
		}
		}*/
		/*Query q=s.getNamedQuery("findSbiBankByName");
		q.setString("Name1","ICICI");
		List<SbiBank>sl=q.list();
		for(int i=0;i<sl.size();i++) {
			System.out.println("name"+sl.get(i).getName());
		System.out.println("count>>>>"+sl.size());
		if(!sl.isEmpty()) {
			SbiBank sb=(SbiBank)sl.get(0);
			System.out.println(">>>>>>"+sb);
		}
		}*/
		
/*List<ank>sl1 =s.createNamedQuery("findSbiBankname",SbiBank.class).getResultList();
//List<SbiBank>sl1=q1.list();
for(int i=0;i<sl1.size();i++) {
	System.out.println("name"+sl1.get(i).getName());
	//System.out.println("Id"+sl1.get(ii).getB_id());


}*/
		/*SbiBank sb=new SbiBank();
		
		sb.setName("SBI");
		SbiBank sb1=new SbiBank();
		sb1.setName("ICICI");
		List<SbiBank>slist=new ArrayList<SbiBank>();
		slist.add(sb);
		slist.add(sb1);
		Customer c1=new Customer();
		c1.setCname("deeksha");
		c1.setSlist(slist);
		
		Customer c2=new Customer();
		c2.setCname("dinnu");
		c2.setSlist(slist);
		Customer c3=new Customer();
		c3.setCname("manju");
		c3.setSlist(slist);
		s.save(c1);
		s.save(c2);
		s.save(c3);
		List<Customer>clist=new ArrayList<Customer>();
clist.add(c1);
clist.add(c2);
clist.add(c3);
s.save(sb);
s.save(sb1);
sb.setClist(clist);
sb1.setClist(clist);*/

tx.commit();
s.close();
sf.close();




		
	}

}

