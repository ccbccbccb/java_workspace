package ch05_1;

public class Machine {
	
	String name;
	int weight;
	
	public Machine(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("��ǰ�� : " + name);
		System.out.println("���� : " + weight);
		findOrigin();
	}

	public void findOrigin() {
		
	}
	
	


}
