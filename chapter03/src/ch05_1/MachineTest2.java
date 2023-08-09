package ch05_1;

import java.util.Random;

public class MachineTest2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int selected = random.nextInt(3) + 1;

		Machine[] product = new Machine[10];
		product[0] = new BearDoll("������", 1000);
		product[1] = new Beer("����", 500);
		product[2] = new KeyRing("Ű��", 50);
		product[3] = new ToyCar("������", 300);
		
		if (selected == 0) {
			product[selected].showInfo();
			String checkOrigin = ((BearDoll) (product[selected])).color;
			System.out.println("���� : " + checkOrigin);
		} else if (selected == 1) {
			product[selected].showInfo();
			int checkOrigin = ((Beer) (product[selected])).alcohol;
			System.out.println("���� : " + checkOrigin);
		} else if (selected == 2) {
			product[selected].showInfo();
			String checkOrigin = ((KeyRing) (product[selected])).brand;
			System.out.println("�귣��� : " + checkOrigin);
		} else if (selected == 3) {
			product[selected].showInfo();
			String checkOrigin = ((ToyCar) (product[selected])).brand;
			System.out.println("�귣��� : " + checkOrigin);
		}

		
	} // end of main

}
// end of class
