package oo.main;

/**
 * 
 * �̰� fork �� �� ��!
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
