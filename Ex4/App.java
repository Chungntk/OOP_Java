import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class App {
	
	public static ArrayList<Employee> readFile(String fileName)
	{
		Scanner scan = null;
		ArrayList<Employee> ems = new ArrayList<>();
		
		try {
			scan = new Scanner(new File(fileName));
			while(scan.hasNext())
			{
				// đọc ra loại nhân viên
				int c = Integer.parseInt(scan.nextLine());
				String name = scan.nextLine();
				String hometown = scan.nextLine();
				int basicSalary = Integer.parseInt(scan.nextLine());
				int days = Integer.parseInt(scan.nextLine());
				if(c == 0)
					ems.add(new Employee(name, hometown, basicSalary, days));
				else if( c == 1)
				{
					// đọc thêm số dự án
					int nProjects = Integer.parseInt(scan.nextLine());
					ems.add(new Developer(name, hometown, basicSalary, days, nProjects));
				}
				else if(c==2){
					int salaryCoef = Integer.parseInt(scan.nextLine());
					ems.add(new Manager(name, hometown, basicSalary, days, salaryCoef));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ems;
	}
	
	public static void printEmployees(ArrayList<Employee> ems)
	{
		for(Employee e: ems)
			System.out.println(e.toString());
	}
	
	// In ra các nhân viên có quê ở "nam định"
	public static ArrayList<Employee> NamDinhEmployees(ArrayList<Employee> ems){
		ArrayList<Employee> ndEmployees = new ArrayList<>();
		for (Employee e: ems){
			if (e.getHometown().equals("Nam Dinh")){
				ndEmployees.add(e);
				System.out.println(e.toString());
			}
		}
		return ndEmployees;
	}
	
	// Tìm các nhân viên có lương cao nhất?
	public static ArrayList<Employee> maxSalary(ArrayList<Employee> ems){
		ArrayList<Employee> maxSalaryList = new ArrayList<>();
		int max = ems.get(0).getBasicSalary();
		for (Employee e: ems){
			if (e.getBasicSalary() > max){
				max = e.getBasicSalary();
			}
		}
		for (Employee e: ems){
			if (e.getBasicSalary() == max){
				maxSalaryList.add(e);
				System.out.println(e);
			}
		}
		return maxSalaryList;
	}
	// Tìm nhân viên có lương thấp nhất và in ra nhân viên đó thuộc loại nào
	public static ArrayList<Employee> minSalary(ArrayList<Employee> ems){
		ArrayList<Employee> minSalaryList = new ArrayList<>();
		int min = ems.get(0).computeSalary();
		for (Employee e: ems){
			if (min > e.computeSalary()){
				min = e.computeSalary();
			}
		}
		for (Employee e: ems){
			if (min == e.computeSalary()){
				minSalaryList.add(e);
				System.out.println(e + " " + e.getTitle());
			}
		}
		return minSalaryList;
	}
	// Sắp xếp lại nhân viên theo lương/ quê quán/ số ngày làm việc
	public static ArrayList<Employee> sortSalary(ArrayList<Employee> ems){
		Employee temp = new Employee();
		for (int i=0; i<ems.size()-1; i++){
			for (int j=i+1; j<ems.size(); j++){
				if (ems.get(i).computeSalary() > ems.get(j).computeSalary()){
					temp = ems.get(i);
					ems.set(i, ems.get(j));
					ems.set(j, temp);
				}
			}
		}
		for (Employee e: ems){
			System.out.println(e);
		}
		return ems;
	}

	public static ArrayList<Employee> sortHometown(ArrayList<Employee> ems){
		Collections.sort(ems, new HometownComparator());
		for (Employee e: ems){
			System.out.println(e);
		}
		return ems;
	}
	
	public static ArrayList<Employee> sortDay(ArrayList<Employee> ems){
		Employee temp = new Employee();
		for (int i=0; i<ems.size()-1; i++){
			for (int j=i+1; j<ems.size(); j++){
				if (ems.get(i).getDays() > ems.get(j).getDays()){
					temp = ems.get(i);
					ems.set(i, ems.get(j));
					ems.set(j, temp);
				}
			}
		}
		for (Employee e: ems){
			System.out.println(e);
		}
		return ems;
	}

	public static void main(String[] args) {
		// Tệp tin gồm
		// Loại nhân viên: 0 - Employee, 1 - Developer, 2 - Manager
		// Thông tin của các nhân viên, mỗi thông tin trên 1 dòng
		// ArrayList<Employee> ems = readFile("employees.txt");
		// printEmployees(ems);
		// NamDinhEmployees(ems);
		// maxSalary(ems);
		// minSalary(ems);
		// sortSalary(ems);
		// sortHometown(ems);
		// sortDay(ems);
	}
}
