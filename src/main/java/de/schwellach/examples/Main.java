package de.schwellach.examples;

public class Main {
	
	public Main() {
		init();
	}
	
	protected void init() {
		Counter c = new Counter();
		c.getCount();
		
	}
	

	public static void main(String[] args) {
		new Main();
	}

}
