package ch05;

public class Fruit {
	
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("��ǰ�� : " + name);
		System.out.println("���� : " + price);
	}

} // end of class
