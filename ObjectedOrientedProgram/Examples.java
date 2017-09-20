package kr.ac.kookmin.cs.oop.exception;

public class Examples {
	public void nullPointerException() {
		String name = null;
		System.out.println(name.toString());
	}
	
	public void arrayIndexOutException() {
		String[] names = new String[5];
		System.out.println(names[6]);
	}
	
	public void handleNpe() {
		try {
			nullPointerException(); // Exception�� �߻��ϴ� �޼ҵ带 �־���
		} catch (NullPointerException npe) {
			System.out.println(npe);
			System.out.println(npe.getMessage());
			System.out.println("null address is referenced");
		} finally {
			System.out.println("handled null pointer exception");
		}
	}
	
	public void handleMultipleException() {
		try {
			nullPointerException();
			arrayIndexOutException();
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			nullPointerException();
			arrayIndexOutException();
		} catch (NullPointerException npe) {
			System.out.println("null pointer exception");
		} catch (ArrayIndexOutOfBoundsException ob) {
			System.out.println("array index out of bounds");
		}
	}
	
	public void throwCustomException() throws CustomException { // � Exception�� �߻���ų �� �ִ��� throw class �� ���� �˰Ե�
		try {
			nullPointerException();
		} catch (NullPointerException npe) {
			throw new CustomException("Converting NPE to Custom Exception"); // Exception�� ���� ������ �� return X throw O
		} finally {
			System.out.println("finally block execution");
		}
	}
	
	public static void main(String[] args) {
		Examples examples = new Examples();
//		examples.nullPointerException();
//		examples.arrayIndexOutException();
//		examples.handleNpe();
//		examples.handleMultipleException();
		examples.throwCustomException(); // try to catch and handle it
		System.out.println("Code complete");
	}
}