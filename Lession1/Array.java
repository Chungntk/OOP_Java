import java.util.Scanner;

public class Array
{
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
        return matrix
    }
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

    public static int sumMatrix(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}