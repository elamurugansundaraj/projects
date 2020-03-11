package org.network;


public class Wifi {
	public void wifiName()
	{
		System.out.println("wifiName");
	}
	
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		MobileData m=new MobileData();
		m.dataName();
		Lan l=new Lan();
		l.lanName();
		Wireless wi=new Wireless();
		wi.modamName();
}
}