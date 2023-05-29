// package chunghocjava.learning_oop.OOP_Java.Ex3;
import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeTest
{
    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n, Scanner scan)
	{
		
		for( int i = 0; i < n; i++) {
			String id = scan.nextLine();
			String name = scan.nextLine();
			String manu = scan.nextLine();
			int quantity = Integer.parseInt(scan.nextLine());
			double price = Double.parseDouble(scan.nextLine());
			double weight = Double.parseDouble(scan.nextLine());
			String date = scan.nextLine();
			motorbikes.add(new Motorbike(id, name, manu, quantity, price, weight, date));
		}
		
	}

	public static void ouputMotorbike(ArrayList<Motorbike> motorbikes)
	{
		for(Motorbike m : motorbikes) {
			m.printMotorbike();
		}
	}

	public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> manuMortobike = new ArrayList<>();
		for(Motorbike m : motorbikes) {
			if (m.getManu().equals(manu))
				manuMortobike.add(m);
		}
		return manuMortobike; 
	}

	public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
	{	
		ArrayList<Motorbike> maxMortobike = new ArrayList<>();
		double max = 0;
		for(Motorbike m : motorbikes) {
			if(m.getWeight() > max) {
				max = m.getWeight();
			}
		}
		for(Motorbike m : motorbikes) {
			if(m.getWeight() == max) {
				maxMortobike.add(m);
			}
		}
		
		return maxMortobike;
	}
	
	public static ArrayList<Motorbike> minQuantity (ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> minMortobike = new ArrayList<>();
		int min = 1000000000;
		for(Motorbike m : motorbikes) {
			if(m.getQuantity() < min) {
				min = m.getQuantity();
			}
		}
		for(Motorbike m : motorbikes) {
			if(m.getQuantity() == min) {
				minMortobike.add(m);
			}
		}
		return minMortobike;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
// 		System.out.println("Nhập số lượng xe: ");
		int n = Integer.parseInt(scan.nextLine());
		ArrayList<Motorbike> motorbikes = new ArrayList<>();
		inputMotorbike(motorbikes, n, scan);
		int c = Integer.parseInt(scan.nextLine());
		scan.close();
// 		ouputMotorbike(motorbikes);
		
		if( c == 1)
			ouputMotorbike(search("Honda", motorbikes));
		if (c == 2)
			ouputMotorbike(maxWeight(motorbikes));
		if (c == 3)
	    	ouputMotorbike(minQuantity(motorbikes));
	}
}
