package ch04;

//�ڵ����� ������ ���迡 �־
//���� ����� ������� ����.
//���� ������ ����� ���� ����� ���� ���־�� �Ѵ�.
public class Car {
	
	private String name;
	private int price;
	// ���� ����
	private Engine engine;
	public Car( String name , int price , Engine engine ) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
	
	
	

} // end of class
