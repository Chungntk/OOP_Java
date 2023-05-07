// in ra các số nguyên tố có trong mảng
import java.util.Scanner;

class PrimesInArray{
    public static void inputArray(int array[], Scanner scan)
    {
        System.out.println("Nhap cac ptu cua mang:");
        for(int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }
    // 
    public static boolean isPrime(int num)
    {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        //editing
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        int[] array = new int [n];
        inputArray(array, scan);
        for (int i=0; i<array.length; i++) {
            if (isPrime(array[i]) == true) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
    