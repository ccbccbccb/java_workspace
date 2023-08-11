package ch13;

// ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ�����̴�.
public class Book extends Object {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// �ʿ��ϴٸ� toString �޼��带 ������ �� �� �ֽ��ϴ�.
	@Override
	public String toString() {
		return this.bookId + ", " + this.title + ", " + this.author;
	}

	// ���� ��Ȥ �ڵ� �׽�Ʈ ���� �� �ִ�.
	// equals �޼��带 ������ �غ���.
	// ���� �����ϴ� å1, å2 ����
	// å�̸��� ���� �����̸� ���ٸ� �������� ���� å�̶��
	// �Ǻ��ϴ� ����� ����� ����.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			// ���� �ȿ��� �˻�
			Book target = (Book) obj;
			if (this.title == target.title) {
				return true;
			}
		}
		return false;
	}

	
	
	
	
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
