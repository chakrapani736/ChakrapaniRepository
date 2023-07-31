package com.te.collectionprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class SetEqualsAndHashCodeMethods extends Thread{
	public static void main(String[] args) {
		SetEqualsAndHashCodeMethods andHashCodeMethods=new SetEqualsAndHashCodeMethods();
		Thread t1=new Thread(andHashCodeMethods);
		Thread t2=new Thread(andHashCodeMethods);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
		
	}
	public void run() {
		Vector<Object> hashSet = new Vector<>();
		hashSet.add(20);
		hashSet.add(40);
		hashSet.add(30);
		Iterator<Object> iterator = hashSet.iterator();
		Thread currentThread = Thread.currentThread();
		while(iterator.hasNext())
		{
			System.out.println(currentThread.getName()+" "+iterator.next());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
		
	

}
