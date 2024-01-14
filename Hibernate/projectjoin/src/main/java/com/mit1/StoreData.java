package com.mit1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;   
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 
  
    
public class StoreData {    
public static void main(String[] args)  throws IOException {    
        
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
    Employee e1=new Employee();   
    Address a1 = new Address();
   e1.setId(1);    
    e1.setFirstname("Rahul");    
    e1.setLastname("Bose");   
    Employee e2=new Employee();    
    Address a2 = new Address();
    e2.setId(2);    
     e2.setFirstname("Ritika");    
     e2.setLastname("Malhotra");   
     
    FileInputStream fis= new FileInputStream("src/main/java/pic.png");
    byte[] data = new byte[fis.available()];
    fis.read(data);
a1.setId(101);
    a1.setStreet("Budruk");
    a1.setCity("Pune");
    a1.setOpen(true);
    a1.setAddedDate(new Date());
    a1.setX(1234.432);
    //a1.setImage(data);
    
    
    a2.setId(102);
    a2.setStreet("Budruk");
    a2.setCity("Pune");
    a2.setOpen(true);
    a2.setAddedDate(new Date());
    a2.setX(1234.432);
    //a1.setImage(data);
    e2.setAddress(a2);
    e1.setAddress(a1);
    a1.setEmployee(e1);
    a2.setEmployee(e2);
   
   
   
   
        
    session.save(e1);  
    session.save(e2); 
    session.save(a1);  
    session.save(a2); 
    t.commit();  
    System.out.println("successfully saved");   
    System.out.println(e1.getId());  
    System.out.println(e1.getFirstname());  
    System.out.println(e1.getLastname());  
    factory.close();  
    session.close();    
        
}    
}   