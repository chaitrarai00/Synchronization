package com.plane;

import com.airline.LineSynchronizedmethods;

public class PlaneSynchronizedMethod extends Thread{
public LineSynchronizedmethods line;
	
	public PlaneSynchronizedMethod(LineSynchronizedmethods line) {
		this.line=line;
	}

	@Override
	public void run() {
		line.getlandingline();
	}
}
