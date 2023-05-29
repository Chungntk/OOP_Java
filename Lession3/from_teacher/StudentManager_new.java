import java.util.Scanner;
import java.util.ArrayList;
public class StudentManager_new {
    public static void inputStudents(ArrayList<Student>){

    }
    public static ArrayList<Student> findMaxScore(ArrayList<Student> arrayStudent){
        double maxScore = 0.0;
		for (Student student : arrayStudent) {
			if (student.getScore() > maxScore) {
				maxScore = student.getScore();
			}
		}
		
		for (Student student : arrayStudent) {
			if (student.getScore() == maxScore) {
				System.out.println(student.toString());
			}
		}
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input number of students
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(scan.nextLine());

        // create array to store students
        // Student[] students = new Student[n];
        ArrayList<Student> arrayStudent = new ArrayList
        // input information for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("ID: ");
            String id = scan.nextLine();
            System.out.print("Hometown: ");
            String hometown = scan.nextLine();
            System.out.print("Score: ");
            double score = Double.parseDouble(scan.nextLine());
            // students[i] = new Student(name, id, hometown, score);
            Student a = new Student(name, id, hometown, score);
            arrayStudent.add(a);
        }

        // find student from Hanoi
        System.out.println("Students from Hanoi:");
        for (Student student : students) {
            if (student.getHometown().equalsIgnoreCase("Hà Nội")) {
                System.out.println(student.toString());
            }
        }

        // find student with max score
        Student maxScoreStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].getScore() > maxScoreStudent.getScore()) {
                maxScoreStudent = students[i];
            }
        }
        System.out.println("Student with max score:");
        System.out.println(maxScoreStudent.toString());
    }
    
}
