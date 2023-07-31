package com.te.jpql.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlQueriesTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		//to fetch all data
		//Query createQuery = createEntityManager.createQuery("select  s from Hero s");
		//List<Hero> resultList = createQuery.getResultList();
		//for(Hero s:resultList)
		//{System.out.println(s.getName()+" -"+s.getRole());
			
		//}
		
		//to fetch names
		//createEntityManager.createQuery("select s.name,s.role from Hero s").getResultStream().forEach(System.out::println);
		
		//to fetch selected data
		//Query createQuery = createEntityManager.createQuery("select s from Hero s where s.name like 's%'");
		
		//to change case
		//Query createQuery = createEntityManager.createQuery("select lower(s.name) from Hero s ");
		//Query createQuery = createEntityManager.createQuery("select s from Hero s ");
		//createQuery.getResultStream().forEach(System.out::println);
		
		//count
		//Query createQuery = createEntityManager.createQuery("select count(e) from Hero e");
		//createQuery.getResultStream().forEach(System.out::println);
		
		//max
		//Query createQuery = createEntityManager.createQuery("select max(e.name) from Hero e");
		//createQuery.getResultStream().forEach(System.out::println);
		
		//secondHighest
		//Query createQuery = createEntityManager.createQuery("select max(e.role) from Hero e where e.role!=(select max(e2.role) from Hero e2)");
		//createQuery.getResultStream().forEach(System.out::println);
		
		//update
		//Query createQuery = createEntityManager.createQuery("update Hero e set e.name='Bijan Kumar' where e.name='Bijan'");
		//createQuery.executeUpdate();
		
		//delete
		//Query createQuery = createEntityManager.createQuery("update Hero e set e.role=null where e.name='Bijan Kumar'");
		//createQuery.executeUpdate();
		//Query createQuery = createEntityManager.createQuery("delete from Hero s where s.name='Bijan Kumar'");
		//createQuery.executeUpdate();
		
		//insert 
		Query createQuery = createEntityManager.createQuery("insert into Hero values('Bijan','odisha','softwareEmployee')");
		createQuery.executeUpdate();
		
		transaction.commit();
	}

}
