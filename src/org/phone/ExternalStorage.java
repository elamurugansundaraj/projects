package org.phone;

public class ExternalStorage {
	public void size()
	{
		System.out.println("size");
	}
	public static void main(String[] args) {
		ExternalStorage e = new ExternalStorage();
		e.size();
		InternalStorage i=new InternalStorage();
		i.processorName();
		i.ramSize();
		
	}
}
