package Exercise;

public class GetterSetter {
	private int speed = 0; // �ʵ�� ������ private�� �ϴ� ����
	private boolean stopped = false;
	
	public boolean isStopped(){ // boolean �� is �ƴϸ� get
		return stopped;
	}
	
	public int getSpeed() { // ���� �޾ƿ� �� Getter, �� ������ Setter
		return speed;
	}
	
	public void setSpeed(int speed) { // getter, setter �� �� �������ִ°��� �߿���
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	
		
}
