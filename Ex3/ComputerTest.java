
import java.util.Scanner;

public class ComputerTest {

	private int n;
	private Computer computers[];
	
	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
	public void input(Scanner scan)
	{
        n = Integer.parseInt(scan.nextLine());
        computers = new Computer[n];
        for (int i = 0; i < n; i++) {
	        String name = scan.nextLine();
	        String manu = scan.nextLine();
	        int year = Integer.parseInt(scan.nextLine());
	        String detail = scan.nextLine();
	        double price = Double.parseDouble(scan.nextLine());
	        computers[i] = new Computer(name, manu, year, detail, price);
	    }
	}
	
	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
	public void output()
	{
		for( int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].toString());
        }
	}
	
	// Trả về giá trung bình của các máy tính
	public double getAvgPrice()
	{
        double sum = 0.0;
        for(Computer c : computers)
            sum += c.getPrice();
		return sum / computers.length;
	}
	
	// In ra các máy tính có giá cao nhất
	public void getMaxPrice()
	{
        double max = 0;
        for(Computer c : computers)
            if (c.getPrice() > max)
                max = c.getPrice();
        for(Computer c : computers)
        if (c.getPrice() == max)
            System.out.println(c.toString());
	}
	
	// In ra các máy tính có nhà sản xuất là Dell
	public void getDell()
	{
        for(Computer c : computers){
            if (c.getManu().equals("Dell")) {
                System.out.println(c.toString());
            }
        }
	}
	
	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
	public void sort()
	{
        Computer temp = null;
        for (int i = 0; i < computers.length - 1; i++) {
            for (int j = i + 1; j < computers.length; j++) {
                if (computers[i].getPrice() < computers[j].getPrice()) {
                    temp =  computers[i];
                    computers[i] = computers[j];
                    computers[j] = temp;
                }
            }
        }
        for (Computer c : computers) {
            System.out.println(c.toString());
        }
    }
	
	
	public static void main(String[] args) {
        ComputerTest computerTest = new ComputerTest();
        Scanner sc = new Scanner(System.in);
        computerTest.input(sc);
        // computerTest.output();
        // computerTest.getAvgPrice();
        // computerTest.getMaxPrice();
        computerTest.getDell();
        // computerTest.sort();
	}

}

// import java.util.Scanner;
// import java.util.ArrayList;

// public class ComputerTest {
	
// 	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
// 	public static ArrayList<Computer> input(Scanner scan)
// 	{   
        
//         // System.out.print("Enter number of computers: ");
// 	    int n = Integer.parseInt(scan.nextLine());
// 	    ArrayList<Computer> computers = new ArrayList<Computer>();
// 	   // Computer cpt[] = new Computer[n];
	    
// 	    for (int i = 0; i < n; i++) {
// 	        String name = scan.nextLine();
// 	        String manu = scan.nextLine();
// 	        int year = Integer.parseInt(scan.nextLine());
// 	        String detail = scan.nextLine();
// 	        double price = Double.parseDouble(scan.nextLine());
// 	        computers.add(new Computer(name, manu, year, detail, price));
// 	    }
//         return computers;
// 	}
	
// 	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
// 	public static void output(ArrayList<Computer> computers)
// 	{
// 		for(Computer c : computers)
// 		    System.out.println(c.toString());
// 	}
	
// 	// Trả về giá trung bình của các máy tính
// 	public static void getAvgPrice(ArrayList<Computer> computers)
// 	{
//         double sum = 0;
//         for(Computer c : computers)
//             sum += c.getPrice();
//         // System.out.println("avg: " + sum / computers.size());
// 		System.out.println( sum / computers.size());
// 	}
	
// 	// In ra các máy tính có giá cao nhất
// 	public static void getMaxPrice(ArrayList<Computer> computers)
// 	{
// 		double max = 0;
//         for(Computer c : computers)
//             if (c.getPrice() > max)
//                 max = c.getPrice();
//         for(Computer c : computers)
//         if (c.getPrice() == max)
//             System.out.println(c.toString());
// 	}
	
// 	// In ra các máy tính có nhà sản xuất là Dell
// 	public static void getDell(ArrayList<Computer> computers)
// 	{

//         // System.out.println("Dell computer: ");
//         for (Computer c : computers) {
//             if (c.getManu().equals("Dell")){
// 				System.out.println(c.toString());
//             }
//         }
// 	}
	
// 	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
// 	public static void sort(ArrayList<Computer> computers)
// 	{
//         Computer temp = null;
// 		for (int i = 0; i < computers.size()-1; i++) {
//             for (int j = i+1; j < computers.size(); j++) {
//                 if (computers.get(i).getPrice() < computers.get(j).getPrice()) {
//                     temp =  computers.get(i);
//                     computers.set(i, computers.get(j));
//                     computers.set(j, temp);
//                 }
//             }
//         }
//         // System.out.println("Sorting computer: ");
//         // System.out.println("Sorting computer: " + computers.size());
//         for (Computer c : computers) {
//             System.out.println(c.toString());
//         }
// 	}
	
// 	public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         // ComputerTest test = new ComputerTest();
//         ArrayList<Computer> test = input(scan);
//         System.out.println("Output computer: ");
//         output(test);
//         System.out.println("Sorting computer: ");
//         sort(test);
//         System.out.println("Dell computer: ");
//         getDell(test);
//         System.out.println("Max price: ");
//         getMaxPrice(test);
//         System.out.println("Avg price: ");
//         getAvgPrice(test);
//         // test.sort(test.computers);
// 	}
// }
