package ch03_1;

public class Hero {
	
	String name;
	int hp;
	
	public Hero( String name , int hp ) {
		this.name = name;
		this.hp = hp;
	}
	// ���� ���� ������ - protected
	// ����� �޴� �ڽ� Ŭ�������� ������ �� �ִ�.
	protected void attack() {
		System.out.println( "�⺻ ������ �մϴ�." );
	}

} // end of class
