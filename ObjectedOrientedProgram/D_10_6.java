public class D_10_6 {

	public static void main(String[] args) {
		
		
		String name = "Object Oriented Programming"; // String = reference type variable (���� Ÿ��) > ������ �޸� �ּҸ� ����
													 // Stack ���� Heap ����
		
		System.out.println(name);
		
		char thirdChar = name.charAt(2);
		System.out.println(thirdChar);

		String subject1 = "Object Oriented Programming";
		String subject2 = "open source software";
		boolean isSubject1Same = name.equals(subject1);  
		boolean isSubject2Same = name.equals(subject2);   
		System.out.println("subject1 : " + isSubject1Same + " subject2 : " + isSubject2Same);
		
		int indexOfProgram = name.indexOf("Programming");
		System.out.println(indexOfProgram);
		System.out.println(name.indexOf("software")); // ������ -1 ���
		
		System.out.println(name.length());
		
		System.out.println(name.substring(7,  15)); // 15�� ° ���� X
		
		System.out.println(name.toUpperCase());
		System.out.println("KOOKMIN UNIV".toLowerCase());
		
		
		
		
		
	
	
	}

}
