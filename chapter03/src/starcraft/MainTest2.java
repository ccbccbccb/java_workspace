package starcraft;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		Zealot targetzealot = new Zealot( "NPC����" );
		Marine targetmarine = new Marine( "NPC����" );
		Zergling targetzergling = new Zergling( "NPC���۸�");
		
		Scanner sc = new Scanner(System.in);
		int q1;
		String n1;
		do { 
			System.out.println( "1.����ϱ� 0.����" );
			q1 = sc.nextInt();
			
			if ( q1 == 1 ) {
				System.out.println( "������ �����մϴ�." );
				System.out.println( "�����Ͻ� ������ �����ϼ���" );
				System.out.println( "1.���� 2.���� 3.���۸�" );
			    int q2 = sc.nextInt();
				if( q2 == 1 ) {
					System.out.println( "������ �����ϼ̽��ϴ�." );
					Zealot zealot1 = new Zealot("����1");
					System.out.println( "������ �����Ǿ����ϴ�!" );
					zealot1.showInfo();
					System.out.println( "������ �����Ͻðڽ��ϱ�? ");
					System.out.println( "1. �� 0. �����ϱ�" );
					int q3 = sc.nextInt();
					if ( q3 == 1 ) { 
						System.out.println( "������ �����մϴ�." );
						System.out.println( "������ ������ �������ּ���.");
						System.out.println( "1.���� 2.���� 3.���۸�");
						int q4 = sc.nextInt();
						if ( q4 == 1 ) {
							zealot1.attack(targetzealot);
						}
					} else if ( q3 == 0 ) {
						System.out.println( "�� ������ �����մϴ�." );
					}
						
					} 
			}
			
		} while ( q1 != 0 ); {
			
		}
		
		System.out.println( "������ �����մϴ�." );

	} // end of main

} // end of class
