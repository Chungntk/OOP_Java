import java.util.Scanner;

public class MyArray {

    // nhap n va nhap mang n so nguyen
    public static int[] arrayInput(Scanner in) {
        int n = in.nextInt();
        int[] Array = new int [n];
        for(int i = 0; i < n; i++){
            Array[i] = in.nextInt();
        }
        return Array;
    }

    // in ra cac phan tu (cach nhau mot dau cach)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isPerfect(int n)
    {
        // begin edit
        if (n == 0) {
            return false;
        }
        int sum = 0;
        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                sum += j;
            }
        }
        if (sum - n == 0) {
            return true;
        } else {
            return false;
        }
        //end edit
        
    }

    // tinh gia tri trung binh cua cac so hoan hao trong mang
    public static double averagePerfectNumbers(int[] arr) {
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isPerfect(arr[i])){
                sum += arr[i];
                count++; 
            }
        }
        if (count > 0) {
            return Math.round(sum/count * 10000.0) / 10000.0;
        } else {
            return 0.0;
        }
    }

    // kiem tra day doi xung
    public static boolean isSymmetricSequence(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        
        return true;
    }

    // sap xep mang tang dan
     public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = arrayInput(in);
        printArray(arr);
        System.out.println();
        System.out.println(averagePerfectNumbers(arr));
        System.out.println(isSymmetricSequence(arr));
        sort(arr);
        printArray(arr);
    }
}