import java.util.Scanner;
public class DayTang {
    public static void inputArray(int array[], Scanner scan){
        System.out.println("Nhap array");
        for (int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }
    public static boolean isIncrease(int array[])
    {
        boolean isIncrease = true;
        for (int i=0; i<array.length-1; i++){
            if (array[i] > array[i+1]){
                isIncrease = false;
                break;
            }
                
        }
        return isIncrease;
    }

    public static void main(String args[]){
        // editing here
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        int[] Array = new int [n];
        inputArray(Array, scan);
        if (isIncrease(Array) == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
