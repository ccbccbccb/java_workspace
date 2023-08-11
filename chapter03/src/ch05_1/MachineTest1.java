package ch05_1;

public class MachineTest1 {

	public static void main(String[] args) {

		Machine[] product = new Machine[10];
		product[0] = new BearDoll("������", 1000);
		product[1] = new Beer("����", 500);
		product[2] = new KeyRing("Ű��", 50);
		product[3] = new ToyCar("������", 300);

		for (Machine a : product) {
			if (a != null) {
				a.showInfo();
				if (a instanceof BearDoll) {
					String checkOrigin = ((BearDoll) (a)).origin;
					System.out.println("���� : " + checkOrigin);
				}
				else if (a instanceof Beer) {
					int checkOrigin = ((Beer) (a)).origin;
					System.out.println("���� : " + checkOrigin);
				}
				else if (a instanceof KeyRing) {
					String checkOrigin = ((KeyRing) (a)).origin;
					System.out.println("�귣��� : " + checkOrigin);
				}
				else if (a instanceof ToyCar) {
					String checkOrigin = ((ToyCar) (a)).origin;
					System.out.println("�귣��� : " + checkOrigin);
				}
			}
		}

	} // end of main

}
// end of class
