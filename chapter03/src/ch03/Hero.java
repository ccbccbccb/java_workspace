package ch03;

public class Hero {
	
	String name;
	int hp;
	
	public Hero( String name , int hp ) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println( this.name + "이 공격합니다." );
	}

} // end of class
