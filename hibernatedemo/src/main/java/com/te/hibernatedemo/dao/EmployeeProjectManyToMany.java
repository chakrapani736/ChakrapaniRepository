package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.*;

public class EmployeeProjectManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Project project1 = new Project();
		project1.setProjectName("games");

		Project project2 = new Project();
		project2.setProjectName("graphics");

		Project project3 = new Project();
		project3.setProjectName("animations");

		ArrayList<Project> arrayList = new ArrayList<>();
		arrayList.add(project1);
		arrayList.add(project2);
		arrayList.add(project3);
		Employee employee1 = new Employee();
		employee1.setEmployeeName("pani");
		employee1.setListOfProjects(arrayList);
		Employee employee2 = new Employee();
		employee2.setEmployeeName("ram");
		employee2.setListOfProjects(arrayList);
		Employee employee3 = new Employee();
		employee3.setEmployeeName("bijan");
		employee3.setListOfProjects(arrayList);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
