package ch03;

public class Warrior extends Hero {
	
	public Warrior( String name , int hp ) {
		super( name , hp );
	}
	
	
	public void comboAttack() {
		System.out.println( "���簡 2�ܰ����� �մϴ�." );
	}
	
    @Override
    public void attack() {
    	System.out.println( this.name + "�� �⺻������ �մϴ�." );
    }


} // end of class
