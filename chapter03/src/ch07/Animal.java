package ch07;

// �߻� Ŭ������
// 1. abstract Ű���带 �����ϸ� �߻� Ŭ������ �ȴ�.
// 2. �ϳ� �̻� �߻� �޼��带 �����ϸ� �ݵ�� �߻� Ŭ������ �Ǿ�� �Ѵ�.
// �߻� Ŭ������ ������

public abstract class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	// �߻� �޼���� !!
	public abstract void hunt();

}
