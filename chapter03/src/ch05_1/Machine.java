package ch05_1;

public class Machine {
	
	String name;
	int weight;
	
	public Machine(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("무게 : " + weight);
		findOrigin();
	}

	public void findOrigin() {
		
	}
	
	


}
