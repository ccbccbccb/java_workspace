package ch10;

public interface RemoteController {
	
	    // �������̽���? 
		// ������ ���� �ƹ��͵� ���� �� �׸��� �ִ� �⺻ ���赵 �̴�. 
		
		// Ư¡ 
		// ��� ����, �Ϲ� ���� �޼��带 ���� �� ����. 
		// ���� �߻� �޼���� ������� ����� ���� �� �ִ�. 
		// �������̽��� ǥ��, ���(�������ִ±�Ģ), �Ծ��� �ǹ��Ѵ�.
		// �߻�Ŭ�������� �߻�ȭ�� �� ����. - ������� �������� ���� Ȱ���Ѵ�. 
		
		public static final int SERIAL_NUMBER = 100; // ������� ���� �� �ִ�. 
		//public int number; ��� ���� ��� �Ұ� 
		
		public abstract void turnOn(); // �߻� �޼��常 ���� �� �ִ�. 
		// public void turnOff() {} �ν��Ͻ� �޼��带 ���� �� ����. 
		
		// �������̽� �ȿ� �����ϴ� ����� ���� public abstract �̴�. 
		// public abstract ���� �����ϴ�.
		void turnOff(); 
		
	} // end of interface
