import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class StudentReadfile {

	public static ArrayList<Student> inputStudents(String fileName) {
		Scanner scan = null;
		ArrayList<Student> arrayStudent = null;
		try {
			scan = new Scanner(new File(fileName));
//			int n = Integer.parseInt(scan.nextLine());
			arrayStudent = new ArrayList<>();

			// Nhập thông tin của từng sinh viên trong mảng
//			for (int i = 0; i < n; i++) {
			while(scan.hasNext()) {
				String name = scan.nextLine();
				String id = scan.nextLine();
				String hometown = scan.nextLine();
				double score = Double.parseDouble(scan.nextLine());
				// tạo ra sinh viên mới với thông tin vừa nhập từ bàn phím
				Student a = new Student(name, id, hometown, score);
				// Add sinh viên mới này vào arraylist
				arrayStudent.add(a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
		return arrayStudent;
	}

	// In thông tin ra màn hình
	public static void printStudents(ArrayList<Student> arrayStudent) {
		// In ra thông tin của các sinh viên
		for (int i = 0; i < arrayStudent.size(); i++)
			System.out.println(arrayStudent.get(i).toString());
	}

	// In thông tin ra tệp tin
	public static void writeFile(ArrayList<Student> arrayStudent, String fileName) {
		Formatter fmt = null;
		try {
			fmt = new Formatter(new File(fileName));
			for(Student s: arrayStudent)
				fmt.format(s.toString() + "\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fmt.close();
	}

	// Tìm các sinh viên có điểm số lớn nhất
	// 1. Tìm điểm số lớn nhất
	// 2. Duyệt Arraylist để tìm ra sinh viên có điểm số = điểm số lớn nhất
	// 3. Add sinh viên đó vào Arraylist mới
	// 4. Trả về Arraylist mới

	public static ArrayList<Student> findMaxScore(ArrayList<Student> arrayStudent) {
		double max = arrayStudent.get(0).getScore(); //
		ArrayList<Student> bestStudents = new ArrayList<>();
		for (int i = 0; i < arrayStudent.size(); i++) {
			if (arrayStudent.get(i).getScore() > max) {
				max = arrayStudent.get(i).getScore();
			}
		}
		for (int i = 0; i < arrayStudent.size(); i++) {
			if (max == arrayStudent.get(i).getScore()) {
				bestStudents.add(arrayStudent.get(i));
			}
		}
		return bestStudents;
	}

	// Tìm sinh viên có quê ở Hà Nội và ghi ra file
	
	
	
	public static void main(String[] args) {
		// khai báo mảng sinh viên

		ArrayList<Student> arrayStudent = inputStudents("students.txt");

		printStudents(arrayStudent);

		// In ra thông tin các sinh viên có điểm số lớn nhất
		System.out.println("Các sinh viên có điểm lớn nhất là: ");
		printStudents(findMaxScore(arrayStudent));
		// ghi ra file
		writeFile(findMaxScore(arrayStudent), "bestStudents.txt");
		//
//		writeFile(findbyHometown(arrayStudent), "Hanoi.txt");
	}

}
