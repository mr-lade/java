package com.tut;
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
        System.out.println( "Project Started!" );
//        Configuration cfg=new Configuration();
//        cfg.configure();
//        SessionFactory factory=cfg.buildSessionFactory();
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
       
//        System.out.println(factory);
        
        Student st=new Student();
        st.setid(102);
        st.setName("John");
        st.setCity("Pune");
        
        System.out.println(st);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        
        session.close();
        
    }
}
