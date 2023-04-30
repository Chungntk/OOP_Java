// Sắp xếp. Viết chương trình ThreeSort.java nhận 3 giá trị nguên từ dòng lệnh và 
// in ra màn hình 3 giá trị theo thứ tự tăng dần. Sử dụng hàm Math.min() và Math.max().


//Viết chương trình theo mô tả Bài 13 trong file Bài tập. 
//Đầu vào là 3 số nguyên nhận từ đối dòng lệnh, 
//kết quả là 3 số theo thứ tự tăng dần in trên 1 dòng. (dùng phương thức println in kết quả)


// import java.util.Scanner;

public class MaxMinThree
{
	public static void main(String args[])
	{
		// truyen ba so tu doi dong lenh ham main
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int max = Math.max(number1, Math.max(number2, number3));
		System.out.println("\n Maximum Number: " + max);
        int min = Math.min(number1, Math.min(number2, number3));
        System.out.println("\n Minimum Number: " + min);
	}
}