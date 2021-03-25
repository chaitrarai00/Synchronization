package com.syncblocks;

public class DemoSyncBlocks {
	public String name="";
	volatile public int count=0; // i am adding volatile just to ensure its not cached anywhere
	public void inccountonchange(String change) {
		synchronized (this) {

			name=change;
			count++; //we have to make sure the count 
			//is not changed/ the state is not changed with multiple thread access
			System.out.println(count);
		}
			
		
	}
	
}
