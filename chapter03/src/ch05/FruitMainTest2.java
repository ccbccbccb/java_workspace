package ch05;

public class FruitMainTest2 {

	public static void main(String[] args) {

		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Peach("������1", 3_000);
		fruits[1] = new Banana("�ٳ���1", 2_000);
		fruits[2] = new Peach("������2", 3_000);
		

		// �迭�� ���� �ݺ����� �Բ� ���� ����Ѵ�.
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] != null) {
				fruits[i].showInfo();
				// ���� �ٳ������ ������ ������ �Բ� ����Ͻÿ�
				if (fruits[i] instanceof Banana) {
					String checkOrigin = ((Banana)(fruits[i])).origin;
					System.out.println("������ : " + checkOrigin);
				}
			}
		}

	} // end of main

} // end of class
