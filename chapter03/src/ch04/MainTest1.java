package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// �ڵ������ Ŭ������ �޸𸮿� �÷�����.
		Engine engine1 = new Engine( "V8" , 2_000 );
		Engine engine2 = new Engine( "V6" , 1_000 );
		Car car1 = new Car( "����" , 8_000 , engine2 );
		car1.getEngine().getName();

	} // end of main

} // end of class
