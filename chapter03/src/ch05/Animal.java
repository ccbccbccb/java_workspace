package ch05;

public class Animal {
	
	public void move() {
		System.out.println( "������ �����Դϴ�." );
	}
	
	public void eating() {
		System.out.println( "������ ���̸� �Խ��ϴ�." );
	}

} // end of Animal class

class Tiger extends Animal {
	
	@Override // �������̵�
	public void move() {
		System.out.println( "ȣ���̰� �׹߷� �����Դϴ�." );
	}
	@Override // �������̵�
	public void eating() {
		System.out.println( "ȣ���̰� ����� �մϴ�." );
	}
} // end of Tiger class

class Human {
	
	public void move() {
		System.out.println( "����� �ι߷� �ɾ�ٴմϴ�." );
	}
	public void eating() {
		System.out.println( "���� �Խ��ϴ�." );
	}
	
	public void readBooks () {
		System.out.println( "����� å�� �н��ϴ�." );
	}
	
} // end of Human class