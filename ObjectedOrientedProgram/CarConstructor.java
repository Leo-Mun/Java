package Exercise;

public class CarConstructor {
	String modelName; //Field
	String manufacturer;
	int modelYear;
	
	
	public CarConstructor(){ // Constructor1 ���� Ŭ������� ���� �̸��� �޼ҵ�� �����ϸ� ��
		this.modelName = "apollo";
		this.manufacturer = "KMU";
		this.modelYear = 2006;
	
	
	} 
		// Constructor�� Ŭ������ �ʱ�ȭ�� ����� �� �� ����ϸ� ��
	                          
	
	public CarConstructor(String model){ // Constructor2 (Overloading)
		modelName = model;
		manufacturer = "KMU";
		modelYear = 0;
	}
	
	public CarConstructor(String model, String company, int year){ // Constructor3 (Overloading)
		modelName = model;
		manufacturer = company;
		modelYear = year;
	}
	
	public CarConstructor(String model, String company){ // Overloading�� Ư¡ �߿� (���� ����)
		this(model, company, 0); // �ٸ� ������ constructor�� ȣ�� ���� (Constructor3 ȣ��)
	}
	
	int getAge(int currentYear){
		int age = currentYear - this.modelYear;
		return age;
	}
	
	public static void main(String[] args){ // Garbage Collection 
		CarConstructor carFieldCheck = new CarConstructor(); // Constructor1 ȣ�� (���ڰ� ����)
		System.out.println(carFieldCheck.modelName);
		System.out.println(carFieldCheck.manufacturer);
		System.out.println(carFieldCheck.modelYear);
		
		carFieldCheck = new CarConstructor("OOP", "leeky", 2014); //Constructor3 ȣ�� (���� 3��) (Overloading)
		System.out.println(carFieldCheck.modelName);
		System.out.println(carFieldCheck.manufacturer);
		System.out.println(carFieldCheck.modelYear);
		
		carFieldCheck = new CarConstructor("OOP", "leeky", 2014);
		System.out.println(carFieldCheck.getAge(2016));
		
		carFieldCheck = new CarConstructor("car", "id", 2010);
		System.out.println(carFieldCheck.getAge(2016));
		
		
	
		
	}
	
}
