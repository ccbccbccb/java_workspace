package ch03_1;

public class Warrior extends Hero {
	
	// !! �θ� Ŭ������ ����� ���� �����ڰ� �ִٸ�
	// �ڽ� Ŭ������ �ݵ�� �θ� �����ڸ� ���� ȣ�� �ؾ��Ѵ�.
	public Warrior( String name , int hp ) {
		// super <-- �θ� �ǹ��Ѵ�.
		// System.out.println("asd"); <-- �θ� �¾�� ���� ���� �� �� ����.
		super( name , hp ); // �θ� �����ڸ� ���� ȣ���ؾ� �Ѵ�.
	}

	public void comboAttack() {
		System.out.println( "���簡 2�� ������ �մϴ�." );
	}
	
	// ��ӿ��� �������̵�
    @Override // ������̼�
    protected void attack() {
    	// super.attack(); // super.
    	System.out.println( super.name + " �⺻ ������ �մϴ�." );
    }
    
    
	
} // end of class
