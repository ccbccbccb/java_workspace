package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		// default : ���� ��Ű�� ������ ���� ����
		Cal2 cal2 = new Cal2();
		cal2.sum( 10 , 20 ); // sum �޼���� �θ�
		cal2.minus( 20 , 10 ); // this �ڽſ� �ִ� �θ�
		
		// ?? Cal �̶� �θ� ��ü�� ������ �Ȱɱ�?
		// �θ� Ŭ������ �޸𸮿� ���� ������ �ǰ�
		// �ڽ� Ŭ������ �޸𸮿� �ö���� �ȴ�.
		
		// multiply �޼��� ������ (�������̵�)
		cal2.multiply( 10 , 0 );
		
		// �޼��� �����ε��� sysout �̴�.
		System.out.println( "�ȳ�" );
		System.out.println( 'A' );
		System.out.println( 100 );
		System.out.println( 0.5 );
		System.out.println( true );
		

	} // end of main

} // end of class
