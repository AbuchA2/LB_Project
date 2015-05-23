package modele;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
  
public class StoreData {  


public static void inscription(String username, String password, String email) {  
    
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Utilisateur e1=new Utilisateur();  
    e1.setEmail(email);
    e1.setPassword(password);
    e1.setUsername(username); 
    
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
public static boolean connexion(String username, String password) {  
    
	boolean result;
	
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating session factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
          
    String hql = "from Utilisateur where username=:username and password=:password";
    Query query = session.createQuery(hql);
    query.setString("username",username);
    query.setString("password",password);
    List results = query.list();
    
    if (results.size()==1){
    	result=true;
    }
    else {
    	result=false;
    }
    session.close();  
      
    System.out.println("successfully saved");  
    return result;
      
}
}  