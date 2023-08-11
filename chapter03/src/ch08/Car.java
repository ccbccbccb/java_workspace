package ch08;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	// �ٽ�! ���ø� �޼��� ����
	// final Ű���带 Ȱ���ؼ� ������ �� �� ������ ����
	// ������ �帧�� �̸� ����� �д�.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
