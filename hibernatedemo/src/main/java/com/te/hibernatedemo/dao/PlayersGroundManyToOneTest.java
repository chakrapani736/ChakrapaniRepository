package com.te.hibernatedemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.dto.*;

public class PlayersGroundManyToOneTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Players players1 = new Players();
		players1.setPlayerName("pani");
		Players players2 = new Players();
		players2.setPlayerName("bijan");
		Players players3 = new Players();
		players3.setPlayerName("ram");
		Ground ground = new Ground();
		ground.setGroundName("Chinnaswamy stadium");
		ground.setGroundUse("cricket");

		players1.setGround(ground);
		players2.setGround(ground);
		players3.setGround(ground);
		createEntityManager.persist(players1);
		createEntityManager.persist(players2);
		createEntityManager.persist(players3);
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();

	}

}
