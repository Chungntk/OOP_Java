import java.util.Scanner;
//2 3 4
//4 1 3
// 2(n)*3(m)
// n = matrix.length
// m = matrix[0].length
// matrix[i][j] (0< i < n, 0< j < m)

/*
 * Ngoài các yêu cầu tương tự như mảng 1 chiều:
 * Mảng 2 chiều:
	- Nhập / in
	- Tính tổng hàng/cột
	- Tìm số lớn/nhỏ nhất của hàng/cột
 */

public class Matrix {
		
		public static void inputMatrix(int matrix[][], Scanner scan)
		{
			System.out.println("Nhap cac phan tu cua ma tran:");
			for(int i=0; i<matrix.length;i++)
				for(int j=0; j < matrix[i].length; j++)
					matrix[i][j] = scan.nextInt();
		}
		
		public static void outputMatrix(int matrix[][])
		{
			for(int i=0; i<matrix.length;i++)
			{
				for(int j=0; j < matrix[i].length; j++)
					System.out.print(matrix[i][j] + "\t");
				System.out.println();
			}
		}
		
		// Tinh tong cac phan tu trong ma tran?
		
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("n = ");
			int n = scan.nextInt();
			System.out.println("m = ");
			int m = scan.nextInt();
			int[][] matrix = new int[n][m];
			inputMatrix(matrix, scan);
			System.out.println("Ma tran vua nhap la: ");
			outputMatrix(matrix);
		}

}
