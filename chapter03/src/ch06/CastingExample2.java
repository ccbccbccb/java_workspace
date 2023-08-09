package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
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
