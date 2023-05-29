import java.util.Scanner;

public class StudentManager {
	
	public static void findHN(Student std[])
	{
		for(int i=0; i < std.length; i++)
			if(std[i].getHometown().equals("Hà Nội"))
				System.out.println(std[i].toString());
	}
	
	public static void main(String[] args) {
		
		// sử dụng hàm dựng không đối để tạo đối tượng
		Student std1 = new Student();
		std1.setName("Hà Linh Chi");
		System.out.println(std1.toString());
		
		// Sử dụng hàm dựng có đối để tạo đối tượng
		Student std2 = new Student("Nguyễn Bá Huy", "02", "Thanh Hoá", 8.0);
		System.out.println(std2.toString());
		
		// Thử tạo 1 đối tượng mới là thông tin của bản thân?
		// Tạo một mảng gồm n sinh viên và nhập thông tin các sinh viên từ bàn phím
		// In ra mảng sinh viên vừa nhập?
		
		
		// nhập vào số sinh viên
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine()); // 3\n --> 3
		
		// khai báo mảng sinh viên
		Student std[] = new Student[n];
		
		// Nhập thông tin của từng sinh viên trong mảng
		for(int i=0; i < n;i++)
		{
			String name = scan.nextLine();
			String id = scan.nextLine();
			String hometown = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());
			std[i] = new Student(name, id, hometown, score);
		}
		
		// In ra thông tin của các sinh viên
		for(int i=0; i < n;i++)
			System.out.println(std[i].toString());
		
		// In ra thông tin của các sinh viên quê ở HN
		findHN(std);

		
		
	}

}
