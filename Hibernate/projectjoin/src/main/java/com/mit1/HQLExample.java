package com.mit1;
import java.util.Arrays;
import java.util.List;



import org.hibernate.Session;   
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class HQLExample {
	public static void main(String[] args)   {    
	
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession(); 
	
	Transaction t = session.beginTransaction(); // Transaction created for delete and update only
	
	
	// ********************1. Select Query for Multiple Results*****************************
	//String query= "from Employee";
		//	Query q1= session.createQuery(query);
			//List <Employee>list =q1.list();
		//	for (Employee e1 :list) {
			//System.out.println(e1.getLastname());
		//	} 
	
	// ********************2. Select Query for Single Result*****************************
	//String query= "from Employee as e where e.id = 106";
	//Query q1= session.createQuery(query);
	//Employee e = (Employee) q1.uniqueResult();
	//System.out.println(e.getLastname());
	
	
	// ********************3.Delete Query *****************************
	
	/* String query = "delete from Employee as e where e.id=:x";
	Query q= session.createQuery(query);
	q.setParameter("x", 102);
     int r = q.executeUpdate();
	System.out.println("Records Deleted :"+r); */
	
	
	// ********************4.Update Query *****************************
	
	/* String query = "update Employee e set lastname='Agrawal' ,firstname='Raman' where e.firstname=:y";
	Query q= session.createQuery(query);
	q.setParameter("y", "Vikas");
	int r = q.executeUpdate();
	System.out.println("Number of Records Updated="+r); */

	// ********************5.Aggregate Functions *****************************
	
	/* Query q= session.createQuery("select count(id) from Employee");
	long count = (Long)q.uniqueResult();
	System.out.println(count);
	
	Query q1= session.createQuery("select sum(id) from Employee");
	long sum = (Long)q1.uniqueResult();
	System.out.println(sum);
	
	
	Query q2= session.createQuery("select max(id) from Employee");
	int max = (Integer)q2.uniqueResult();
	System.out.println(max);
	
	Query q3= session.createQuery("select min(id) from Employee");
	int min = (Integer)q3.uniqueResult();
	System.out.println(min);
	
	Query q4= session.createQuery("select avg(id) from Employee");
	Double avg = (Double)q4.uniqueResult();
	System.out.println(avg);       
	
	
	*/

	
	// ********************6.Join  Functions (Inner Join) *****************************
	
String query = "select e.firstname,e.lastname, a.street from Employee as e INNER JOIN e.address as a ";
	Query q = session.createQuery(query);
List <Object[]> list = q.list();
for (Object [] arr:list)
{
System.out.println(Arrays.toString(arr));	
}

	
	t.commit(); // t.commit() will be called for delete and update query only
	session.close();
	factory.close();
	
	}

}
