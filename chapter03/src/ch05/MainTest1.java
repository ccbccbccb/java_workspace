package ch05;

public class MainTest1 {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Tiger tiger1 = new Tiger();
		Human human1 = new Human();
		
		// �������� ����
		Animal animal2 = new Tiger();
		
		Animal[] arrayAnimals = new Animal[ 10 ];
		arrayAnimals[ 0 ] = tiger1;
		arrayAnimals[ 1 ] = animal1;
		// arrayAnimals[ 2 ] = human1;
		// Animal animal3 = new Human();
		// ��������� ������ �������� Ȯ�εǴ� �κ��� Ȯ��
		System.out.println( "-----------------------------------------" );
		
		tiger1.move();
		tiger1.eating();

	} // end of main

} // end of class
