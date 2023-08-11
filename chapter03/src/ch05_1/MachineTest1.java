package ch05_1;

public class MachineTest1 {

	public static void main(String[] args) {

		Machine[] product = new Machine[10];
		product[0] = new BearDoll("곰인형", 1000);
		product[1] = new Beer("맥주", 500);
		product[2] = new KeyRing("키링", 50);
		product[3] = new ToyCar("모형차", 300);

		for (Machine a : product) {
			if (a != null) {
				a.showInfo();
				if (a instanceof BearDoll) {
					String checkOrigin = ((BearDoll) (a)).origin;
					System.out.println("색깔 : " + checkOrigin);
				}
				else if (a instanceof Beer) {
					int checkOrigin = ((Beer) (a)).origin;
					System.out.println("도수 : " + checkOrigin);
				}
				else if (a instanceof KeyRing) {
					String checkOrigin = ((KeyRing) (a)).origin;
					System.out.println("브랜드명 : " + checkOrigin);
				}
				else if (a instanceof ToyCar) {
					String checkOrigin = ((ToyCar) (a)).origin;
					System.out.println("브랜드명 : " + checkOrigin);
				}
			}
		}

	} // end of main

}
// end of class
