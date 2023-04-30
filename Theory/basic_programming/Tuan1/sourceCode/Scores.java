import java.util.Scanner;

class Scores{
	public static void main(String[] args){
		int n;
		// Nhập n từ đối dòng lệnh
		if(args.length != 1){
			System.out.println("java Score <so hoc sinh>");
			return;
		}
		n = Integer.parseInt(args[0]);
		// Nhập n phần tử của mảng
		String[] names = new String[n];
		double[] scores = new double[n];
		System.out.println("Nhap thong tin ten va diem thi cua " + n + " sinh vien:");
		inputScores(names, scores);
		
		// In n phần tử của mảng
		System.out.println("Danh sach diem thi:");
		printScores(names, scores);
		
	}
	
	public static void printScores(String[] names, double[] scores){
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-20s%8.1f\n", names[i], scores[i]);
		}
	}
	
	public static void inputScores(String[] names, double scores[]){
		Scanner scan1 = new Scanner(System.in), scan2 = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			do{
				System.out.println("Ten sinh vien thu " + (i+1) +":");
				names[i] = scan1.nextLine();
			}while(names[i].compareTo("")==0);

			do{
				System.out.println("Diem thi: ");
				scores[i] = scan2.nextDouble();
				if(scores[i]<0 || scores[i]>10){
					System.out.println("Gia tri khong hop le. Nhap lai:");
				}
				else
					break;
			} while(true);
		}	
	}

}

