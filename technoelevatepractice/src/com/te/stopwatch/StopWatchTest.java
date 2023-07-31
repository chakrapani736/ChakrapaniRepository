package com.te.stopwatch;

public class StopWatchTest {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		Thread thread= new Thread(stopWatch);
		thread.start();
	}

}
