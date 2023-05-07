/**
 * Nhập số nguyên N và một mảng A gồm N số nguyên từ bàn phím
 * Sắp xếp A tăng dần về giá trị và in ra mảng đã sắp xếp
 * */
import java.util.Scanner;
import java.util.Arrays;

class SortArray{
    public static void inputArray(int array[], Scanner scan){
        System.out.println("Nhap array");
        for (int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }
    
    public static void main(String args[]){
        // editing here
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        int[] Array = new int [n];
        inputArray(Array, scan);
        Arrays.sort(Array);
        for (int i=0; i<Array.length; i++)
            System.out.print(Array[i] + " ");
    }
}
