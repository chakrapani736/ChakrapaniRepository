package com.te.streams;

import java.util.*;

class Transaction {
	String name;
	int transactions;

	public Transaction(String name, int transactions) {
		super();
		this.name = name;
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTransactions() {
		return transactions;
	}

	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}
}

public class SumOfTransactionsForSpecificUser {
	public static void main(String[] args) {
		List<Transaction> list = Arrays.asList(new Transaction("pani", 100), new Transaction("ram", 200),
				new Transaction("pani", 100), new Transaction("bijan", 100), new Transaction("ram", 100),
				new Transaction("bijan", 100));
		System.out.println("enter any name from : ram , pani , bijan");
		Scanner sn = new Scanner(System.in);
		String name = sn.next();
		Integer amount = list.stream().filter(e -> e.getName().equals(name)).map(e -> e.getTransactions()).reduce(0,
				(a, b) -> a + b);
		System.out.println(name + " transacted : " + amount);

	}

}
