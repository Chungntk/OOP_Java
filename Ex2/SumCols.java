// Nhập ma trận A cỡ m x n, sau đó in ra n tổng các phần tử của n cột.
import java.util.Scanner;

class SumCols{
    public static void inputMatrix(int matrix[][], Scanner scan){
        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[i].length; j++)
                matrix[i][j] = scan.nextInt();
    }
    public static int[] sumcol(int matrix[][]) {
        int[] colsum = new int [matrix[0].length];
        for (int j = 0; j<matrix[0].length; j++){
            int sum = 0;
            for (int i = 0; i<matrix.length; i++){
                sum = sum + matrix[i][j];
            }
            colsum[j] = sum;
        };
        return colsum;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("number of rows = ");
        int rows = scan.nextInt();
        System.out.println("number of cols = ");
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhap cac phan tu cua ma tran: ");
        inputMatrix(matrix, scan);
        int[] sumMatrix = sumcol(matrix);
        for (int i=0; i<sumMatrix.length; i++)
            System.out.print(sumMatrix[i] + " ");
    }
    
}