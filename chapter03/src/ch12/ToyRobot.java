package ch12;

public class ToyRobot implements RemoteController, SoundEffect {
	
	int width;
	int height;
	String color;
	String name;
	
	@Override
	public void turnOn() {
		System.out.println("�峭�� �κ��� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("�峭�� �κ��� ���ϴ�.");
	}

	@Override
	public void notification() {
		System.out.println("�εεεΤ̵εΤ̵�");
	}
	

}
