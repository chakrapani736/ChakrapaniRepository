package com.te.jpql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.jpql.dto.Hero;

public class NamedQueryTest {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("findAll");
		List resultList = createNamedQuery.getResultList();
		System.out.println(resultList);
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();
		

	}
}
