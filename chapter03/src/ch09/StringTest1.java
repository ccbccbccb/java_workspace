package ch09;

public class StringTest1 {
	
public static void main(String[] args) {
		
		// String 
		// ���ڿ��̶�� �����͸� ����, ���� ��� 
		// static ����, �����Ϳ���, --> ��� Ǯ ���� 
		
		String str1 = "�ݰ���";
		String str2 = new String("�ݰ���");
		String str3 = "�ݰ���";
		
		System.out.println(str1);
		System.out.println(str2);
		
		// �ó����� 1 
		if(str1 == str2) {
			System.out.println("�ּҰ��� ���ƿ�!");
		} else {
			System.out.println("�ּҰ��� �޶��");
		}
		
		
		// �ó����� 2
		// ���ͷ� ������� ������ ���ڿ��� 
		// �̹� ������ ���� �Ȱ��ٸ� ���� ������ �ʰ� 
		// ��Ȱ�� �Ѵ�. 
		if(str1 == str3) {
			System.out.println("�ּ� ����");
		} else {
			System.out.println("�ּ� �ٸ�");
		}
		
		System.out.println("******************");
		// �ó����� 3 
		str3 = "�ݰ����ϴ�"; // ���� ���� 
		if(str1 == str3) {
			System.out.println("�ּ� ���ƿ�~ �ٽ� Ȯ��");
		} else {
			System.out.println("�ּ� �޶��! �ٽ� Ȯ��");
		}
		
		System.out.println("---------------------------");
		// �ó����� 4 
		// ���ڿ��� ���� ���ҷ��� equals�� �ݵ�� ����ϼ���
		if(str1.equals(str2)) {
			System.out.println("���� ���̿���. ");
		} else {
			System.out.println("�ٸ� ���̿���. ");
		}
	}
}
