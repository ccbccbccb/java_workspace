package ch05_1;

import java.util.Random;

public class MachineTest3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int selected = random.nextInt(4);

		Machine[] product = new Machine[10];
		product[0] = new BearDoll("������", 1000);
		product[1] = new Beer("����", 500);
		product[2] = new KeyRing("Ű��", 50);
		product[3] = new ToyCar("������", 300);
		
		product[selected].showInfo();
	

		
	} // end of main

}
// end of class
