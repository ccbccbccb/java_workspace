package ch03;

public class Archer extends Hero {
	
	public Archer( String name , int hp ) {
		super( name , hp );
	}
	
	public void fireArrow() {
		System.out.println( "궁수가 불화살 공격을 합니다." );
	}
	
	@Override
	public void attack() {
		System.out.println( this.name + "이 기본공격을 합니다." );
	}

} // end of class
