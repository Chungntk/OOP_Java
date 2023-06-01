import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AthleteManager {

	/* Khởi tạo một ArrayList có kiểu Athlete
	 * Khai báo một biến Scanner đọc dữ liệu từ tệp có tên filename
	 * Đọc n
	 * Đọc từng thuộc tính của một Athlete
	 * Khởi tạo một đối tượng Athlete với các thuộc tính vừa đọc được từ file
	 * Add vào ArrayList
	 * */
	public static ArrayList<Athlete> readFile(String filename) {
        Scanner scan = null;
        ArrayList<Athlete> atl = new ArrayList<>();
        
        try {
            scan = new Scanner(new File(filename));
            int n = Integer.parseInt(scan.nextLine());
            
            while (scan.hasNext()) {
                // Đọc ra thông tin vận động viên
                String name = scan.nextLine();
                int year = Integer.parseInt(scan.nextLine());
                String sport = scan.nextLine();
                double weight = Double.parseDouble(scan.nextLine());
                double height = Double.parseDouble(scan.nextLine());
                
                Athlete athlete = new Athlete(name, year, sport, weight, height);
                atl.add(athlete);
            }
            
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return atl;
    }
	
	/*
	 * In dữ liệu của từng vận động viên sử dụng toString()
	 * Phương thức này không cần sửa gì
	 */
	public static void print(ArrayList<Athlete> aths)
	{
		for(Athlete a: aths)
		{
			System.out.println(a.toString());
		}
	}
	
	/*
	 * Tính chỉ số BMI của từng vận động viên
	 * BMI được tính theo công thức BMI = cân nặng/(chiều cao *chiều cao)
	 * Trong đó cân nặng được tính bằng kg, chiều cao được tính bằng m
	 * In mỗi chỉ số BMI với 3 chữ số sau dấu phẩy, mỗi chỉ số cách nhau một dấu tab (\t)
	 */
	public static void printBMIs(ArrayList<Athlete> aths)
	{
        for (Athlete ath : aths) {
            
        }
	}
	
	/*
	 * Tìm và trả về các vận động viên có môn thi đấu là sport (với sport sẽ được truyền vào cụ thể khi gọi hàm)
	 */
	public static ArrayList<Athlete> findSport(ArrayList<Athlete> aths, String sport)
	{
	
		return null;
	}
	
	/*
	 * Tìm và trả về các vận động viên có chiều cao cao nhất
	 */
	public static ArrayList<Athlete> findAthlete(ArrayList<Athlete> aths)
	{
		
		return null;
	}
	/*
	 * Sắp xếp danh sách theo thứ tự từ điển của họ và tên (a-z)
	 * In ra danh sách sau khi sắp xếp
	 */
	public static void sort(ArrayList<Athlete> aths)
	{
		// Sắp xếp
		
		
		
		// In danh sách sau khi sắp xếp
		print(aths);
	}
	
	// Hàm main không cần phải sửa gì
	
	public static void main(String[] args) {
		ArrayList<Athlete> aths = readFile("athletes.txt");
		print(aths);
		printBMIs(aths);
		System.out.println();
		print(findSport(aths, "Bong Chuyen"));
		print(findAthlete(aths));
		System.out.println("SORT: ");
		sort(aths);
	}
}
