package com.te.hibernatemapping.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatemapping.dto.BankAccount;
import com.te.hibernatemapping.dto.BankAccountHolder;

public class BankHolderBankAccountsOneToManyMapping {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();

		// create

		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setBankAccountName("Canara");
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setBankAccountName("SBI");
		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setBankAccountName("HDFC");
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(bankAccount1);
		list.add(bankAccount2);
		list.add(bankAccount3);
		BankAccountHolder bankAccountHolder1 = new BankAccountHolder();
		bankAccountHolder1.setBankAccountHolderName("Ram Charan");
		bankAccountHolder1.setListOfBankAccouns(list);
		createEntityManager.persist(bankAccountHolder1);

		// BankAccountHolder user1 = createEntityManager.find(BankAccountHolder.class,
		// 1);
		BankAccount bankAccount11 = createEntityManager.find(BankAccount.class, 1);
		
		// BankAccount bankAccount2 = createEntityManager.find(BankAccount.class, 2);
		// BankAccount bankAccount3 = createEntityManager.find(BankAccount.class, 3);

		// try {
		// read
		// System.out.println("User Id : "+user1.getBankAccountHolderId());
		// System.out.println("User Name : "+user1.getBankAccountHolderName());
		// System.out.println("User Accounts : "+" 1 :
		// "+bankAccount1.getBankAccountName()+" , 2 :
		// "+bankAccount2.getBankAccountName()+" , 3 :
		// "+bankAccount3.getBankAccountName());
		// }
		//catch(Exception e)
		//{
			//System.out.println("invalid data");
		//}
		// update
		//try {
			
		
		// user1.setBankAccountHolderName("NTR");
		// bankAccount1.setBankAccountName("ICICI");
		//}
		// delete
		// user1.setBankAccountHolderName(null);

		// } catch (Exception e) {
		// System.out.println("data is not present");
		// } finally {
		transaction.commit();
		createEntityManager.close();
		entityManagerFactory.close();
		// }
	}
}
