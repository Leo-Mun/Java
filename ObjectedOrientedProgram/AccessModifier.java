package Exercise;

public class AccessModifier extends Object {
	private String name;
	private String id;
	int years; // default ���� ��Ű�� �ȿ��� ���� ����
	public String phoneNumber;
	
	public void setName(String name){
		this.name = name;
	}
	
	protected String getID(){
		return id;
	}
	
	public void doHomework(){
		reviewClass();
	}
	
	private void reviewClass(){ // private �ܺο��� ȣ�� X
			
		
	}
}
