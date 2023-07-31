package com.te.hibernatedemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.*;

public class SchoolPrincipalOneToOneDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
//		Principal principal = new Principal();
//		principal.setPrincipalName("pani");
//		School school = new School();
//		school.setSchoolName("TechnoElevate High School");
//		school.setPrincipal(principal);
//		entityManager.persist(school);
		// read
//entityManager.createQuery("select s from School s").getResultStream().forEach(System.out::println);
		School find = entityManager.find(School.class, 1);
		System.out.println("school id : "+find.getSchoolId()+" school name :"+find.getSchoolName()+" "+find.getPrincipal());

		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
