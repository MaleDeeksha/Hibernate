package com.hibernate2.hibernate2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Student std1 = new Student();
       // std1.setId(2);
        std1.setName("Tom");
        std1.setCity("Hyderabad");
        Student std2 = new Student();
       // std1.setId(3);
        std2.setName("deeksha");
        std2.setCity("Hyderabad");
        Student std3 = new Student();
      //  std1.setId(4);
        std3.setName("manju");
        std3.setCity("Hyderabad");
        s.save(std1);
        s.save(std2);
        s.save(std3);
       Query query=s.getNamedQuery("findStudentById");
        query.setParameter("Id1", 3);
        List<Student>list=query.list();
        for(int i=0;i<list.size();i++){
        	System.out.println("name:"+list.get(i).getName());
        }
        System.out.println("...."+list.size());
       /* Query query1=s.getNamedQuery("findStudentByname");
        query1.setParameter("name1", "deeksha");
        List<Student>list1=query1.list();
        for(int i=0;i<list1.size();i++){
        	System.out.println("name:"+list1.get(i).getName());
        }
        System.out.println("...."+list1.size());*/
       /* System.out.println("aggregate funtion example");
        Query q2=s.createQuery("select count(*)from Student");
        System.out.println("count:"+q2.list().get(0));
        Query q3=s.createQuery("select min(id)from Student");
        System.out.println("count:"+q3.list().get(0));
String s1="select count(id),city from student group by city having count(id)>1 order by count(id) desc";
System.out.println("group by clause example");*/
       /* Query q4=s.getNamedQuery("getStudentOrderBy");
        List<Student> list4=q4.list();
        for(int i=0;i<list4.size();i++) {
        	System.out.println("count:"+list4.get(i));
        }*/
        Query q5=s.getNamedQuery("getStudentCount");
        List<Student> list5=q5.list();
        for(int i=0;i<list5.size();i++) {
        	System.out.println("count:"+list5.get(i));
        }
        tx.commit();
        s.close();
    }
}
