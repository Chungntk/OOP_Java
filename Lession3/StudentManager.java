public class StudentManager {
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
            
    public static void inputArray(String array[], Scanner scan)
      {
         for(int i=0; i<array.length; i++)
             array[i] = scan.nextInt();
      }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("So sinh vien: ");
        int n = scan.nextInt();
        for (int i=0; i<n; i++){
            String[] Array = new String [4];
            inputArray(Array, scan);
            Student std2 = new Student(Array[0],Array[1], Array[2], Array[3]);
        }
    }
}



		// // sử dụng hàm dựng không đối để tạo đối tượng
		// Student std1 = new Student();
		// std1.setName("Hà Linh Chi");
		// System.out.println(std1.toString());
		
		// // Sử dụng hàm dựng có đối để tạo đối tượng
		// Student std2 = new Student("Nguyễn Bá Huy", "02", "Thanh Hoá", 8.0);
		// System.out.println(std2.toString());
		
		// // Thử tạo 1 đối tượng mới là thông tin của bản thân?
		// // Tạo một mảng gồm n sinh viên và nhập thông tin c