package com.mit.orm4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mit.orm4.dao.StudentDao;
import com.mit.orm4.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
     //  Student student = new Student(2,"Raj","Ahemdabad");
       /* int r = studentDao.insert(student);
       System.out.println("Successfully added"); */
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       boolean go= true;
       while(go) {
    	   
    	   System.out.println("Press 1 for adding new Student");
    	   System.out.println("Press 2 for displaying all Students");
    	   System.out.println("Press 3 for displaying Single Students");
    	   System.out.println("Press 4 for deleting Students");
    	   System.out.println("Press 5 for updating Students");
    	   System.out.println("Press 6 for Exit");
    	   try {
    		 int input = Integer.parseInt(br.readLine());
    		 switch(input) {
    		 
    		 case 1:
    			 System.out.println("Enter Id");
    			 int sId = Integer.parseInt(br.readLine());
    			 System.out.println("Enter Name");
    			String sName = br.readLine();
    			 System.out.println("Enter City");
    			 String sCity = br.readLine();
    			 Student s = new Student();
    			 s.setId(sId);
    			 s.setName(sName);
    			 s.setCity(sCity);
    			 int r = studentDao.insert(s);
    			 System.out.println("Student Added Successfully");
    			 break;
    		 case 2 :
    			 List<Student> allStudents = studentDao.getAllStudents();
    			 for(Student st : allStudents) {
    				 System.out.println("Id is :-"+st.getId());
    				 System.out.println("Name is :-"+st.getName());
    				 System.out.println("City is :-"+st.getCity());
    			 }
    			 break;
    		 case 3:
    			 System.out.println("Enter Id");
    			 int stuId = Integer.parseInt(br.readLine());
    			 Student student = studentDao.getStudent(stuId);
    			 System.out.println("Id is :-"+student.getId());
				 System.out.println("Name is :-"+student.getName());
				 System.out.println("City is :-"+student.getCity());
				 break;
    		 case 4:
    			 System.out.println("Enter Id");
    			 int delId = Integer.parseInt(br.readLine());
    			 studentDao.deleteStudent(delId);
    			 System.out.println("Student Deleted");
    			 break;
    		 case 5:
    			 System.out.println("Enter Id");
    			 int upId = Integer.parseInt(br.readLine());
    			 Student upStudent = studentDao.getStudent(upId);
    			 System.out.println("Update Name");
    			 String upName = br.readLine();
    			 System.out.println("Update City");
    			 String upCity = br.readLine();
    			 upStudent.setName(upName);
    			 upStudent.setCity(upCity);
    			 studentDao.updateStudent(upStudent);
    			 System.out.println("Student Updated");
    			 break;
    		 case 6:
    			 go=false;
    			 System.out.println("Program Ended");
    			 break;
    			 default:
    				 System.out.println("Invalid Input"); 
    				 break;
    			 
    			 
    		 }
    		   
    	   }catch(Exception e) {
    		   System.out.println("Exception Occured"); 
    		   System.out.println(e.getMessage()); 
    	   }
       }
       
    }

}
