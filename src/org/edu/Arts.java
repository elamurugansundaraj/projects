package org.edu;

public class Arts extends Education {
	public void bsc() {
		System.out.println("bsc");
		
	}
	public void bed() {
		System.out.println("bed");
		
	}
	@Override
	public void ug() {
		System.out.println("me");
	}
	@Override
	public void pg() {
		System.out.println("mtech");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bed();
		a.bsc();
		a.pg();
		a.ug();
	}
}
