package ch05_1;

public class BearDoll extends Machine {
	
	String origin;
	
	public BearDoll(String name, int weight) {
		super(name, weight);
		origin = "ȸ��";
	}
	
	public void findOrigin() {
		System.out.println(origin);
	}

	

} // end of class
