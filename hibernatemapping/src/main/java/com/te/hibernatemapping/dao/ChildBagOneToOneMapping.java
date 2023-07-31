package com.te.hibernatemapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatemapping.dto.*;

public class ChildBagOneToOneMapping {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		// creating
		Bag bag = new Bag();
		bag.setBagName("Avengers Bage");
		bag.setBagColor("red with whites3");
		Child child = new Child();
		child.setChildName("Chintsu3");
		child.setBag(bag);
		createEntityManager.persist(child);
		//Child find = createEntityManager.find(Child.class, 1);

		try {
			// read
//			try {
//				System.out.println(find.getChildId() + " " + find.getChildName() + " " + find.getBag());
//			} catch (Exception e) {
//				System.out.println("data is wrong");
//			}

			// update
//			try {
//				// find.setChildName("bantu");
//				System.out.println(find.getChildId() + " " + find.getChildName() + " " + find.getBag().getBagColor());
//			} catch (Exception e) {
//				System.out.println("provide sufficient data");
//			}
			// delete
//			try {
//				find.setChildName(null);
//				// System.out.println("Child Id: " + find.getChildId() + " Child Name: " +
//				// find.getChildName());
//			} catch (Exception e) {
//				System.out.println("provide valid data");
//			}

		} catch (Exception e) {
			System.out.println("data is not present");
		} finally {
			transaction.commit();
			createEntityManager.close();
			entityManagerFactory.close();
		}
	}
}
