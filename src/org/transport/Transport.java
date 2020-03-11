package org.transport;
import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {
	public void TransportForm()
	{
		System.out.println("TransportForm");
	}
	
	public static void main(String[] args) {
		Transport t = new Transport();
		t.TransportForm();

		Road r=new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.car();
		Air a=new Air();
		a.aeroPlane();
		a.heliCopter();
		Water w=new Water();
		w.boat();
		w.ship();
}
}