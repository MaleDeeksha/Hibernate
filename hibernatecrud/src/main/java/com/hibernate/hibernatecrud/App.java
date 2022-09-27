package com.hibernate.hibernatecrud;

import com.hibernate.hibercrud.dao.StudentDao;
import com.hibernate.hibercrud.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       StudentDao s = new StudentDao();
      //Student std1=new Student("manju","bangulur");
       //s.saveStudent(std1);
      //  s.updateStudent("siri",2);
      // s.deleteStudent(2);
       // s.getStudentList();
       // s.sortStudent();
      s.searchById();
      /*  std1.setId(2);
        std1.setName("Tom");
        std1.setCity("Hyderabad");*/
       
    }
}
