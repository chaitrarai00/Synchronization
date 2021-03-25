package com.syncblocks;

import java.util.List;

public class Threaddemo extends Thread{
	public DemoSyncBlocks dsb;
	public List<String> list;
	public Threaddemo(DemoSyncBlocks dsb,List<String> list) {
		this.dsb=dsb;
		this.list=list;
	}
	
	@Override
	public void run() {
		for(String str:list)
			dsb.inccountonchange(str);
	}
	
	
}
