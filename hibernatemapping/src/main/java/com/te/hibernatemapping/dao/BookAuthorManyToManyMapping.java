package com.te.hibernatemapping.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernatemapping.dto.*;

public class BookAuthorManyToManyMapping {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		//Book book1 = createEntityManager.find(Book.class, 1);
		
		try {
			// create
//			Book book1 = new Book();
//			book1.setBookName("Ramayana");
//			Book book2 = new Book();
//			book2.setBookName("mahabharatha");
//			Book book3 = new Book();
//			book3.setBookName("vikramaditya");
//			Book book4 = new Book();
//			book4.setBookName("Comics");
//
//			List<Book> listOfBooks1 = new ArrayList<>();
//			listOfBooks1.add(book1);
//			listOfBooks1.add(book2);
//			listOfBooks1.add(book3);
//			listOfBooks1.add(book4);
//
//			Author author1 = new Author();
//			author1.setAuthorName("valmiki");
//
//			Author author2 = new Author();
//			author2.setAuthorName("kalki");
//
//			Author author3 = new Author();
//			author1.setAuthorName("Vemana");
//			List<Author> listOfAuthors = new ArrayList<>();
//			listOfAuthors.add(author1);
//			listOfAuthors.add(author2);
//			listOfAuthors.add(author3);
//			author1.setListOfBook(listOfBooks1);
//			author2.setListOfBook(listOfBooks1);
//			book1.setListOfAuthors(listOfAuthors);
//			book2.setListOfAuthors(listOfAuthors);
//			createEntityManager.persist(author1);
//			createEntityManager.persist(author2);
			//catch(Exception e){
			//System.out.println();
			
			//read
//			Query createQuery = createEntityManager.createQuery("select s from Book s");
//			List<Book> resultList = createQuery.getResultList();
//			List<Author> resultList1 = createQuery.getResultList();
//			for(Book b:resultList) {
//				System.out.println(b.getBookId()+" , "+b.getBookName());
//				
//			}
			

			//System.out.println(book1.getBookId()+" : "+book1.getBookName());
			
			//update
			//book1.setBookName("Songs");
			//System.out.println(book1.getBookId()+" : "+book1.getBookName());
			
			//delete
			//book1.setBookName(null);
			//System.out.println(book1.getBookId()+" : "+book1.getBookName());
			
			

		} catch (Exception e) {
			System.out.println("data not present");
		} finally {
			transaction.commit();
			createEntityManager.close();
			entityManagerFactory.close();
		}

	}

}
