/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>
import java.util.Scanner;

public class FindMinMax{
    public static void inputArray(int array[], Scanner scan){
        // System.out.println("Nhap array");
        for (int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }

    public static int findMin(int Array[]){
        //editing here
        int min = Array[0];
        for (int i=0; i<Array.length; i++)
            if(Array[i]<min)
                min = Array[i];
        return min;
    }
    
    public static int findMax(int Array[]){
        //editing here
        int max = Array[0];
        for (int i=0; i<Array.length; i++){
            if(Array[i]>max)
                max = Array[i];
        }
        return max;
    }
    
    public static void main(String args[]){
        // editing here
        Scanner scan = new Scanner(System.in);
        // System.out.println("n = ");
        int n = scan.nextInt();
        int[] Array = new int [n];
        inputArray(Array, scan);
        System.out.println(findMin(Array)+" " + findMax(Array));
    }
}