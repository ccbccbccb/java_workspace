package ch02;

public class Cal {
	
	// �Ӽ�...
	
	// ���
	
	public Cal() {
		System.out.println( "cal() ������ ȣ�� - �θ�" );
	}
	
	public int sum( int n1 , int n2 ) {
		return n1 + n2;
	}
	
	public int multiply( int n1 , int n2 ) {
		return n1 * n2;
	}
	
	

} // end of class

// ��ü ���� �з����� �ٽ�
// ** ��ü�� ��ü���� ��ȣ�ۿ� �׸��� ���踦 ������ ������ ��
class Cal2 extends Cal {
	
	public Cal2() {
		System.out.println( "cal2() ������ ȣ�� - �ڽ�" );
	}
	
	public int minus( int n1 , int n2 ) {
		return n1 - n2;
	}
	
	// ��ӿ����� �޼����� �����ǰ� �����ϴ�.
	
	// �ּ� + ��Ʈ
	@Override // ������̼� �̶� �θ���.
	public int multiply( int n1 , int n2 ) {
		if( n1 == 0 || n2 == 0) {
			System.out.println( "0�� �Է� �Ͽ����ϴ�." );
		}
		return n1 * n2;
	}
	// ���� ���� ����� �������̵� ��� �Ѵ�.
	
	// �������̵� != �����ε� - �ٸ� ���� �Դϴ�.
	// ������ �����ε� --> �޼��� �����ε�
	public int minus( int n1 , int n2 , int n3 ) {
		return n1 - ( n2 - n3 );
	}
	
}
