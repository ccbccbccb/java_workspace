package ch03;

public class Wizard extends Hero {
	
	public Wizard( String name , int hp ) {
		super( name , hp );
	}
	
	public void freezing() {
		System.out.println( "�����簡 ���� ������ �մϴ�." );
	}
	
	@Override
	public void attack() {
		System.out.println( this.name + "�� �⺻������ �մϴ�." );
	}

} // end of class
