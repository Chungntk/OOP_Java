public class ControlExample
{
	public static void main(String args[])
	{
		int a = 0;
		if(a > 0)
		{
			System.out.print(a + " la so duong");
			//
		}
		else if( a == 0)
			System.out.print(a + " = 0");
		else
			System.out.print(a + " la so am");
		
		int c = 9;
		switch(c)
		{
			case 1: System.out.print("Chu nhat");
					break;
			case 2: System.out.print("Thu 2");
					break;
			case 3: System.out.print("Thu 3");
					break;
			default: System.out.print("khong phai thu trong tuan");
		}
	}
}