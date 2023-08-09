package starcraft;

public class Unit {
	
	protected String name;
	protected int power;
	protected int hp;
	
	public Unit( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower( int power ) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp( int hp ) {
		this.hp = hp;
	}
	
	public void attack( Unit unit ) {
		System.out.println( name + "�� " + unit.getName() + "�� �����մϴ�." );
		unit.beattacked( power );
	}
	
	public void beattacked( int power ) {
		if( hp <= power ) {
			hp = 0;
			System.out.println( name + " �̹� ��� �Ͽ����ϴ�. HP : " + hp );
			return;
		}
		hp-= power;
		System.out.println( name + "�� HP : " + hp );
	}
	
	public void showInfo() {
		System.out.println( "=== ����â ===" );
		System.out.println( "�̸� : " + name );
		System.out.println( "���ݷ� : " + power );
		System.out.println( "ü�� : " + hp );
	}
	
	

} // end of class
