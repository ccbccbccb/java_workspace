package ch05_1;

public class ToyCar extends Machine {
	
	String origin;
	
	public ToyCar(String name, int weight) {
		super(name, weight);
		origin = "benz";
	}
	
	public void findOrigin() {
		System.out.println(origin);
	}

	
}
