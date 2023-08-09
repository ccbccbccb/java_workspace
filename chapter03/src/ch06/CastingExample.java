package ch06;

public class CastingExample {

	public static void main(String[] args) {
		
		// ������, ��ĳ����(Upcasting)
		// ��ĳ������ ���� Ŭ������ ��ü�� ���� Ŭ���� Ÿ������
		// ��ȯ �ϴ°��� ���մϴ�. �� ��쿡�� ������ �ս��� �����ϴ�.
		// ��ĳ������ �ڵ������� �̷�����Ƿ� ������ ����ȯ �����ڰ� 
		// �ʿ� �����ϴ�.
		
		Animal animal = new Bird();
		// animal.fly();
		// �ٿ� ĳ�����̶�
		// �ٿ� ĳ�����̶� ��ĳ���õ� ��ü�� �ٽ� ������ ����
		// Ŭ���� Ÿ������ ��ȯ �ϴ°��� ���մϴ�. �ٿ� ĳ������
		// ���������� ����ȯ �����ڸ� ����Ͽ� �̷�����ϴ�.
		// ��ĳ���õ� ��ü�� ���� Ŭ������ �޼��峪 �Ӽ��� ����ϱ� ����
		// �ʿ��մϴ�.
		Bird bird = (Bird)animal;
		bird.fly();
		
		
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();
		
		System.out.println("=====================================");
		// 0 -- Animal -> if --> false
		// 1 -- Bird -> if --> true
		// 2 -- Animal -> if --> false
		for (Animal a : animals) {
			a.makeSound();
			// a.fly(); // ������ Ÿ���� Ȯ���ϰ� �ʹٸ� instanceof ������
			if(a instanceof Bird) {
				Bird targetbird = (Bird)a;
				targetbird.fly();
			}
			System.out.println("---------------------------");
		}
		
//		for (int i = 0; i < animals.length; i++) {
//			
//		}
		
		
		

	} // end of main

} // end of class
