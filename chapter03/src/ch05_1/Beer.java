package ch05_1;

public class Beer extends Machine {

	int origin=5;

	public Beer(String name, int weight) {
		super(name, weight);
		origin = 5;
	}
	
	public void findOrigin() {
		System.out.println(origin);
	}
	

}
