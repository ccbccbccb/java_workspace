package ch08;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI�� ���� ������ �մϴ�.");
		System.out.println("������ ������ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("AI�� ������ ���� ����ϴ�.");
	}
	
	// run() �޼��� final Ű���带 ����߱⶧���� ������ �Ұ��� !  
	
}