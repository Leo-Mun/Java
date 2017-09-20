package kr.ac.kookmin.cs.oop.inheritance;

public class SmartWatch extends SmartPhone {
	public SmartWatch(String model, String color, String appMarket) { // �θ� Ŭ������ Constructor �� �ִ� ��� ������ �θ�Ŭ������ Constructor�� ȣ��(super ���)
		super(model, color, appMarket);								  // �θ� Ŭ������ ��ü�� �ڽ� Ŭ������ �� ����� �ִ� �ǹ̸� ����
	
	}
	
	@Override
	public void runBrowser() {
		// super.runBrowser(); // super �� ���̸� �θ� Ŭ������ �ν��Ͻ��� ȣ����
		System.out.println("Staring a Samrt Watch Browser");
		System.out.println("Executing Smart Watch Browser");
		// super.runBrowser(); // ���� Ŭ���� ������ this
		
	}
	
	public static void main(String[] args) {
		SmartWatch smartWatch = new SmartWatch("apple", "Yellow", "AppStore");
		smartWatch.powerOn();
		smartWatch.runBrowser();
		
	}
}
