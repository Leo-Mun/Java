package Exercise;

public class InstanceThis {
	String model;
	int speed;
	
	int age;
	
	void IncreasAge(int age){
		this.age += age;
	}
	
	
	InstanceThis(String model){ //Constructor
		this.model = model;
		
	}
	
	void setSpeed(int speed){ //�ʵ� ���̶� ���� ���̶� ���� (���� ���� ����) this�� Ŭ������ ����� ��ü ���� �ʵ� ���� ������ �� ��� 
		this.speed = speed;
	}
	
	
	
	
	
}