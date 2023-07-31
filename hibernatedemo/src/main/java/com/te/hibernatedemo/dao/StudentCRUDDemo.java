package com.te.hibernatedemo.dao;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.te.hibernatedemo.dto.Student;

public class StudentCRUDDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		//Student student = new Student();
		// creating
		/*
		 * student.setStudentName("KL rahul"); student.setStudentAge(28);
		 * student.setAddress("bangalore"); createEntityManager.persist(student);
		 */
		// updating
		Query createQuery = createEntityManager.createQuery("select s.studentName from Student s");
		//@SuppressWarnings("unchecked")
		//List<Student> resultList = createQuery.getResultList();
		//for(Student l:resultList) {
		//	System.out.println(l);
		//}
		createQuery.getResultStream().forEach(System.out::println);
		/*try {
			
			//find.setStudentAge(100);update
			createEntityManager.remove(find);//delete
			
		} catch (Exception e) {
			System.out.println("data is not present");
		}finally {*/
			transaction.commit();
			createEntityManager.close();
			entityManagerFactory.close();
		
		
	}

}
