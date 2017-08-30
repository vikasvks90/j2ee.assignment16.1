package assignment16.session1.util;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

import assignment16.session1.bean.Lecturer;
  
public class LecturerClient {  
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();
	    Lecturer l1=new Lecturer(); 
	    l1.setfName("Vijay");
	    l1.setlName("Sharma");
	    
	    session.saveOrUpdate(l1);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	    System.out.println("Lecturer successfully saved");  
	      
	}  
}