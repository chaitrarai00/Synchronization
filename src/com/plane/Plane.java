package com.plane;

import com.airline.Line;

public class Plane extends Thread{
	public Line line;
	
	public Plane(Line line) {
		this.line=line;
	}

	@Override
	public void run() {
		line.getlandingline();
	}
	
}
