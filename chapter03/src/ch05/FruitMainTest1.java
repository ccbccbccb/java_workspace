package ch05;

public class FruitMainTest1 {

	public static void main(String[] args) {
		
		// ������
		// ! ��� - ��ĳ����
		Fruit fruit1 = new Banana("����Ʈ�ٳ���", 2_000);
		Fruit fruit2 = new Peach("û��������", 3_000);
		
		fruit1.showInfo();
		fruit2.showInfo();
		// �ٳ��� ��ü�� origin ���� ���� ��� �غ���.
		// ��ĳ���� �� ���¿����� ������ ������ Ȯ���� �Ѵ�.
		
		// System.out.println(fruit1.origin); ���� Ȯ��
		// ?? ������ ������ ��� origin �̶�� ������ ����ұ�?
		
		// 1�ܰ� - �ٿ� ĳ����
		Banana banana1 = ((Banana)(fruit1));
		System.out.println(banana1.origin);
		// 2�ܰ� - �ٿ� ĳ����
		String checkOrigin = ((Banana)(fruit1)).origin;

	} // end of main

} // end of class
