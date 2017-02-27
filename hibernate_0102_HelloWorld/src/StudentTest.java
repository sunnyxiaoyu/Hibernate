import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.xiaoyu.hibernate.model.Student;


public class StudentTest {
	public static void main(String[] args) {
//		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Student s = new Student();
//		s.setId(3);
//		s.setName("s1");
//		s.setAge(10);
//		
//		session.save(s);
//		transaction.commit();
		 Student s=new Student();  
	        s.setId(5);  
	        s.setName("t1");  
	        s.setAge(1);
	        Configuration cfg=new Configuration();  
	        SessionFactory sf=cfg.configure().buildSessionFactory();  
	        Session session=sf.openSession();  
	        session.beginTransaction();  
	        session.save(s);  
	        session.getTransaction().commit();  
	        session.close();  
	        sf.close();  
		
	}

}
