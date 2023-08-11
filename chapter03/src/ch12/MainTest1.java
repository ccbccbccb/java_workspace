package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		// ���
		// �ڵ带 �� �� �����ϰ� Ȯ�强 �ְ�
		// ������ �� ǥ��, �Ծ�, ��Ģ�� ���Ѽ� �����ϰ� �ʹٸ�
		// �������̽��� Ȱ������.

		HomeAppliances appliances1 = new Television();
		HomeAppliances appliances2 = new Refrigerator();
		// HomeAppliances appliances3 = new ToyRobot();

		RemoteController controller1 = new Television();
		RemoteController controller2 = new Refrigerator();
		RemoteController controller3 = new ToyRobot();

		RemoteController[] remoteControllers = new RemoteController[3];

		remoteControllers[0] = new Television();
		remoteControllers[1] = new Refrigerator();
		remoteControllers[2] = new ToyRobot();
		
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn();
		}
		
		System.out.println("-------------------------------");
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOff();
		}

	}

}
