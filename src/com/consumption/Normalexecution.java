package com.consumption;

import com.airline.Line;
import com.airline.LineSynchronizedmethods;
import com.plane.Plane;
import com.plane.PlaneSynchronizedMethod;

public class Normalexecution {

	public static void main(String[] args) {
		Line l=new Line();
		Plane p1=new Plane(l);
		Plane p2=new Plane(l);
		Plane p3=new Plane(l);
		Plane p4=new Plane(l);
		/*
		 * all planes will access the same line simultaneously
		 * unaware of the access of line getting done by other threads
		 */
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		/*
		 * Lets try to synchronize this to distribute the process 
		 * and make all flights aware of the state of other flights
		 *  before accesing the lines  
		 *  so all planes access the lines in a 
		 *  sequential manner patiently waiting for the lock
		 */
		LineSynchronizedmethods lsm=new LineSynchronizedmethods();
		PlaneSynchronizedMethod psm1=new PlaneSynchronizedMethod(lsm);
		PlaneSynchronizedMethod psm2=new PlaneSynchronizedMethod(lsm);
		PlaneSynchronizedMethod psm3=new PlaneSynchronizedMethod(lsm);
		psm1.start();
		psm2.start();
		psm3.start();
	}

}
