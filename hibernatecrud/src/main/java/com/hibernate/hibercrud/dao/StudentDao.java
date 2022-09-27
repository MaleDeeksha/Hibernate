package com.hibernate.hibercrud.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hibercrud.model.Student;
import com.hibernate.hibercrud.util.StudentUtil;

public class StudentDao {
	public void saveStudent(Student student) {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			session.save(student);
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
	public void updateStudent(String name,int id) {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			Query q=session.createQuery("update Student set name=:name where id=:id");
			q.setParameter("name",name);
			q.setParameter("id",id);
            int i=q.executeUpdate();
            System.out.println("********"+i);            
            if(i>0) {
            	System.out.println("uadated successfully");
            }
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
	public void deleteStudent(int id) {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			Query q=session.createQuery("delete from Student where id=:id");
			q.setParameter("id",id);
            int i=q.executeUpdate();

            if(i>0) {
            	System.out.println("deleted successfully");
            }
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
	public void getStudentList() {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			Query q=session.createQuery("from Student");
          
			List<Student>arr=q.list();
			for(Student s:arr) {
				System.out.println("id=  "+s.getId()+"Name=  "+s.getName()+"city=   "+s.getCity());
			}
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
	public void sortStudent() {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			Query q=session.createQuery("from Student order by name");
          
			List<Student>arr=q.list();
			for(Student s:arr) {
				System.out.println("id=  "+s.getId()+"Name=  "+s.getName()+"city=   "+s.getCity());
			}
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}
	public void searchById() {
		Transaction trans=null;
		try {
			Session session=StudentUtil.getSessionFactory().openSession();
			trans=session.beginTransaction();
			Query q=session.createQuery("from Student where id=:id");
			List<Student>arr=q.list();
			for(Student s:arr) {
				System.out.println("id=  "+s.getId()+"Name=  "+s.getName()+"city=   "+s.getCity());
			}
			trans.commit();
		}
		catch(Exception e) {
			if(trans!=null) {
				trans.rollback();
			}
			e.printStackTrace();
		}
	}



		// TODO Auto-generated method stub

	}


