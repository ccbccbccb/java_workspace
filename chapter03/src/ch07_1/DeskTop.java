package ch07_1;

public class DeskTop extends Computer {
	
	// ���� �޼��� �������̵�
	@Override
	public void display() {
		System.out.println("����Ϳ� ȭ���� ����մϴ�.");
	}
	
	@Override
	public void typing() {
		System.out.println("Ű����� ���ڸ� �Է��մϴ�.");
	}

}
