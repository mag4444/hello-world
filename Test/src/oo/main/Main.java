package oo.main;

/**
 * 
 * 이건 fork 된 넘 것!
 * 
 * @author
 *
 */
public class Main {
	
	public Main() {
		try {
			process();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void process() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		new Main();
	}

}
