package ch05_1;

public class KeyRing extends Machine {
	
	String origin;
	
	public KeyRing(String name, int weight) {
		super(name, weight);
		origin = "BMW";
	}
	
	public void findOrigin() {
		System.out.println(origin);
	}

	

} // end of class
