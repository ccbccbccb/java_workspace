package starcraft;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		Zealot targetzealot = new Zealot( "NPC질럿" );
		Marine targetmarine = new Marine( "NPC마린" );
		Zergling targetzergling = new Zergling( "NPC저글링");
		
		Scanner sc = new Scanner(System.in);
		int q1;
		String n1;
		do { 
			System.out.println( "1.계속하기 0.종료" );
			q1 = sc.nextInt();
			
			if ( q1 == 1 ) {
				System.out.println( "유닛을 생성합니다." );
				System.out.println( "생성하실 유닛을 선택하세요" );
				System.out.println( "1.질럿 2.마린 3.저글링" );
			    int q2 = sc.nextInt();
				if( q2 == 1 ) {
					System.out.println( "질럿을 선택하셨습니다." );
					Zealot zealot1 = new Zealot("질럿1");
					System.out.println( "질럿이 생성되었습니다!" );
					zealot1.showInfo();
					System.out.println( "유닛을 공격하시겠습니까? ");
					System.out.println( "1. 네 0. 종료하기" );
					int q3 = sc.nextInt();
					if ( q3 == 1 ) { 
						System.out.println( "유닛을 공격합니다." );
						System.out.println( "공격할 유닛을 선택해주세요.");
						System.out.println( "1.질럿 2.마린 3.저글링");
						int q4 = sc.nextInt();
						if ( q4 == 1 ) {
							zealot1.attack(targetzealot);
						}
					} else if ( q3 == 0 ) {
						System.out.println( "곧 게임을 종료합니다." );
					}
						
					} 
			}
			
		} while ( q1 != 0 ); {
			
		}
		
		System.out.println( "게임을 종료합니다." );

	} // end of main

} // end of class
