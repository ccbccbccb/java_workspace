package ch03_1;

public class Wizard extends Hero {
	
	public Wizard( String name , int hp ) {
		super( name , hp );
	}
	
	public void freezing() {
		System.out.println( "���� ������ �մϴ�." );
	}
	
	@Override
	protected void attack() {
		System.out.println( name + "�� �⺻ ������ �մϴ�." );
	}

} // end of class
