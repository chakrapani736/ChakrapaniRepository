package com.te.jpql.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.jpql.dto.Hero;

public class HeroTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Hero hero1=new Hero("Bijan","odissa","Software");
		Hero hero2=new Hero("NTR","Andhra","Helper");
		Hero hero3=new Hero("Sharukh Khan","Kolkata","ArmyMan");
		Hero hero4=new Hero("Vijay","Tamilnadu","Comedian");
		Hero hero5=new Hero("Chris Hemsworth","Australia","villion");
		
		createEntityManager.persist(hero1);
		createEntityManager.persist(hero2);
		createEntityManager.persist(hero3);
		createEntityManager.persist(hero4);
		createEntityManager.persist(hero5);
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();
	}

}
