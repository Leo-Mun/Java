package kr.ac.kookmin.cs.oop.inheritance;

public class Student extends People {
	private int studentNo;
	
	public Student(String name, String ssn, int studentNo) { // �θ�Ŭ������ Constructor�� ���ڸ� ���� ��� super�� ����ؾ���
		super(name, ssn); // �θ� Ŭ������ Constructor �� ȣ��
		this.studentNo = studentNo;
		
	}

}