package ch01;

public class A {

	String name;
	int height;
	int weight;
	int age;

	public static void main(String[] args) {

		C c1 = new C();
		c1.age = 10;
		System.out.println(c1.age);

	} // end of main

} // end of class

// �ϳ��� .java ���� �ȿ��� �������� Ŭ������ ������ �� �ִ�.
// ��, �ϳ��� �ڹ� ���Ͽ��� �������� ������ public class ��
// �� �ϳ��� ���� �����ϴ�.

class B {

	String name;
	int height;
	int weight;
	int age;
	String tel;

}

class C extends A {

	String phone;
	// main �Լ� �׽�Ʈ - ��� �ڸ��� ����

}