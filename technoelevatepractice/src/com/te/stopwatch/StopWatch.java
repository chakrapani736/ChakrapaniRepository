package com.te.stopwatch;

public class StopWatch implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.print(i+" : ");
			for (int j = 1; j <=60; j++) {
			
				System.out.print(j+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}System.out.println();
		}
		
	}
	

}
