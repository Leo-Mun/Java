package Exercise;

public class StaticMember {

	String color; // ��ü�� ������ ������ color ���� �޶��� �� ����
	static double pi = 3.14159265;
	
	static int plus(int x, int y){ // ���ڵ��� ��ü ���� �ν��Ͻ��� ���� X >> static
		return x + y;
	}
	
	static int minus(int x, int y){ // ...
		return x - y;
	}
	
	double test () {
		return pi;
	}
	
	void setColor(String color){ // static ���� this �� ��(��ü�� ���ӵƱ� ����)
		this.color = color;
	}
	
	String getColor(){ // ...
		return color;
	}
	
	public static void main(String[] args){ // �ڹٴ� ������ main �Լ��� ã�Ƽ� �����Ŵ(main�� ���� �� �� ���� ����)
		StaticMember staticExercise = new StaticMember(); // ��ü ����
//		 System.out.println(this.color); //(static ������ this. �� �� �� - ��ü�� ����X)
		staticExercise.setColor("Blue");
		StaticMember staticExercise2 = new StaticMember();
		System.out.println(staticExercise.color + staticExercise2.color);
		int radius = 5;
		double sizeOfCircle = StaticMember.pi * radius * radius; // recommended (Static Member �� �θ����� 
		sizeOfCircle = staticExercise.pi * radius * radius; // not recommended   ��ü�� ���� �ͺ��� Ŭ���� �̸��� ���ִ� ���� ����)
	}
	
	
}