package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.*;

public class CountryStatesOneToManyDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		State state = new State();
		state.setStateName("Andhra");
		State state2 = new State();
		state2.setStateName("Odissa");
		State state3 = new State();
		state3.setStateName("Tamilnadu");
		State state4 = new State();
		state4.setStateName("Bihar");
		State state5 = new State();
		state5.setStateName("Karnataka");
		ArrayList<State> list1 = new ArrayList<>();
		list1.add(state);
		list1.add(state2);
		list1.add(state3);
		list1.add(state4);
		list1.add(state5);
		Country country = new Country();
		country.setCountryName("India");
		country.setStateList(list1);
		createEntityManager.persist(country);
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();

	}

}
