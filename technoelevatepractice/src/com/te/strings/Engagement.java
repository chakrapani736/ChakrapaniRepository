package com.te.strings;

public class Engagement {
	public  void engagementDay()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" hi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
