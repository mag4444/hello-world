package oo.main;

public class Main {
	
	public Main() {
		try {
			process();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	public void process() throws Throwable {
		
		System.out.println("Hello, World!");
		
	}

	public static void main(String[] args) {
		
		new Main();
		
	}

}
