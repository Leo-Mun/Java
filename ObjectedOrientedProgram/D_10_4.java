import java.io.IOException; //����ó��

public class D_10_4 {

	public static void main(String[] args) throws IOException {
		
		
		// for = ��Ȯ�ϰ� roop�� �� �� ���� �� �� ���
		// while = �󸶳� roop�� ���� �� ���
		
		
		// for (�ʱ�ȭ;���ǹ�;����){
		// 		����
		// }
		
		/*
		for (int i = 0; i < 10; i++){
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		int sum =0;
		for (int i = 1; i <= 10 ; i++)
		{
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("sum from 1 to 10 is " + sum);
		
		*/
		
		/*
		for (int i = 2 ; i <= 9 ; i++)
		{
			System.out.println(i + "��");
			for (int j = 1 ; j <=9 ; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j );
			}
			
			System.out.println("\n");
		}
		*/
		
		/*
		// while��
		int index = 0; // �ʱ�ȭ
		while (index <= 5) // ���ǹ�
		{
			System.out.println("index is " + index++); // ����
		}
		*/
		
		/*
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run)
		{
			if (keyCode != 13 && keyCode != 10)
			{
				System.out.println("--------------------------------------");
				System.out.println("1. Increment | 2. Decrement | 3. Stop ");
				System.out.println("--------------------------------------");
				System.out.println("Select : ");
			}
			
			keyCode = System.in.read(); // System.in.read ��� �� throw IOException (����ó�� ����ؾ���.)
			if (keyCode == 49) 
			{ //1
				System.out.println("Current = " + ++speed);
			} 
			else if (keyCode == 50)
			{ //2
				System.out.println("Current = " + --speed);
			} 
			else if (keyCode == 51)
			{ //3
				run = false;
			}
			
			
		}
		*/
		
	/*	
		int keyCode1 = 0;
		do {
			if (keyCode1 != 13 && keyCode1 != 10)
			{
				System.out.println("press 1 to exit");
			}
			
			
		keyCode1 = System.in.read();
	}
	while (keyCode1 != 49); // do-while ���� while () ; �����ݷ� �ʼ�
		System.out.println("Exit from do-while");
	}
	
		*/
	/*	
	System.out.println("press 1 to exit");
	int keyCode2 = System.in.read();
	while(keyCode2 != 49)
	{
		if (keyCode2!=13&&keyCode2!=10)
		{
			System.out.println("press 1 to exit");
		}
		keyCode2 = System.in.read();
	}
	*/
	
		/*
	while (true)
	{
		int num = (int) (Math.random() * 6) + 1;
		if (num == 6)
		{
			break;
		}
		else 
		{
			System.out.println("A number from a dice : " + num);
		}
	}
	System.out.println("Exit from a dice");
		*/
		
	/*
	for (char A = 'A' ; A <= 'Z' ; A++)
	{
		for (char a = 'a' ; a <= 'z' ; a++)
		{
			System.out.println(A + " : " + a);
			if (a == 'c')
			{
				break;
			}
		}
	}
	*/
		
		/*
		for(int i = 1; i <= 10; i++) // ¦�� ǥ�� �ڵ�
		{ 
			if(i % 2 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		*/
		
		
		
		
	}
	

}