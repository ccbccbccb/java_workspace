package ch03;

public class Archer extends Hero {
	
	public Archer( String name , int hp ) {
		super( name , hp );
	}
	
	public void fireArrow() {
		System.out.println( "�ü��� ��ȭ�� ������ �մϴ�." );
	}
	
	@Override
	public void attack() {
		System.out.println( this.name + "�� �⺻������ �մϴ�." );
	}

} // end of class
