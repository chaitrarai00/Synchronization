package com.airline;

public class LineSynchronizedmethods {
	synchronized public void getlandingline() {
		for(int i=0;i<5;i++) { //we will fix number of lines as 5 for now
			System.out.println(i+" flight land ");
			try {
				Thread.sleep(300);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
