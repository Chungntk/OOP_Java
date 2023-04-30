import java.util.Scanner;

public class Example1
{
	public static void main(String args[])
	{
		// truyen hai so tu doi dong lenh ham main
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		double d = (double) number1/number2;
		
		System.out.printf("Thuong cua hai so la: %.3f", d);
		
		// nhap hai so tu ban phim
		// Khai bao bien nhap
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao so thu nhat: ");
		int a = scan.nextInt();
		System.out.print("Nhap vao so thu hai: ");
		int b = scan.nextInt();
		double t = (double) a/b;
		
		int c = a + 1; // 
		a = a + 1; // a++, a += 1; a--, a -= 1;
		
		System.out.printf("Thuong cua hai so la: %.3f", t);
		
		
	}
}