import java.util.Scanner;

public class Array {
	/*
	- Nhập/in
	- Tính tổng, trung bình cộng, tìm max, min.
	- Tính chất số: tìm số nguyên tố, số chính phương, số hoàn hảo
	- Tính chất mảng: mảng đối xứng, mảng đan dấu (hai phần tử ở cạnh nhau thì khác dấu nhau a[i] * a[i+1] < 0), cấp số cộng, cấp số nhân?
	- Sắp xếp tăng dần/ giảm dần
	*/
	public static void inputArray(int array[], Scanner scan)
	{
		System.out.println("Nhap cac phan tu cua mang:");
		for(int i=0; i<array.length;i++)
			array[i] = scan.nextInt();
	}
	
	public static void outputArray(int array[])
	{
		for(int i=0; i<array.length;i++)
			System.out.print(array[i] + "\t");
	}
	
	// Tinh tong cac phan tu trong mang?
	public static int sum(int array[]){
        int sum=0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n = ");
		int n = scan.nextInt();
		int[] array = new int[n];
		inputArray(array, scan);
		outputArray(array);
		
		// Goi ham tinh tong cac phan tu trong mang?
		System.out.println("\nTong cac phan tu trong mang la: " + sum(array));
	}

}
