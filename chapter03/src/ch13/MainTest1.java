package ch13;

import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {
		
		// List list;

		// �ڹٿ��� ����� ���� ��Ӹ��� �����մϴ�.
		// ��, Object Ŭ������ �����ϰ�
		
		Book book1 = new Book(1, "ȫ�浿��", "���");
		Book book2 = new Book(2, "ȫ�浿��", "���");
		Book book3 = new Book(2, "�帣�°���ó��", "�Ŀ���ڿ���");
		
		if(book1 == book2) {
			System.out.println("���������� ���ƿ�");
		} else {
			System.out.println("���������� �޶��");
		}
		System.out.println("--------------------------");
		
		if(book1.equals(book2)) {
			System.out.println("���� å�Դϴ�.");
		} else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
		
	}

}
