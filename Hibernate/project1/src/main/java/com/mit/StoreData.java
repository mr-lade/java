package com.mit;

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
    e1.setId(1004);    
    e1.setFirstname("Rahul");    
    e1.setLastname("Bose");   
    FileInputStream fis= new FileInputStream("src/main/java/pic.png");
    byte[] data = new byte[fis.available()];
    fis.read(data);
    Address a1 = new Address();
    a1.setStreet("Budruk");
    a1.setCity("Pune");
    a1.setOpen(true);
    a1.setAddedDate(new Date());
    a1.setX(1234.432);
    a1.setImage(data);
   
   
   
        
    session.save(e1);  
    session.save(a1);  
    t.commit();  
    System.out.println("successfully saved");   
    System.out.println(e1.getId());  
    System.out.println(e1.getFirstname());  
    System.out.println(e1.getLastname());  
    factory.close();  
    session.close();    
        
}    
}   