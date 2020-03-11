package org.com;

public class Desktops implements HardWare,Software {

	@Override
	public void softwareResources() {
		System.out.println("softwareResources");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}
	public void desktopModel() {
		System.out.println("desktopModel");
	}
	public static void main(String[] args) {
		Desktops s=new Desktops();
		s.softwareResources();
		s.hardwareResources();
		s.desktopModel();
	}

}
