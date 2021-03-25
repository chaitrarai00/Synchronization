package com.consumption;

import java.util.ArrayList;

import com.syncblocks.DemoSyncBlocks;
import com.syncblocks.Threaddemo;

public class Blockconsumption {

	public static void main(String[] args) {
		ArrayList<String> str_l=new ArrayList<String>();
		str_l.add("hi");
		str_l.add("bye");
		DemoSyncBlocks dsb= new DemoSyncBlocks();
		Threaddemo td1=new Threaddemo(dsb, str_l);
		Threaddemo td2=new Threaddemo(dsb, str_l);
		/*
		 * here value opf count is inconsisten but i want it to be diaplyed in sync
		 * with zero inconsistency
		 */
		td1.start();
		td2.start();
	}

}
