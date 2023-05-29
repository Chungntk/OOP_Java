// Hoàn thiện hàm kiểm tra số nguyên tố isPrime
// Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime
import java.util.Scanner;

public class NberProps {
    public static void inputArray(int array[], Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static boolean isPrime(int k) {
        boolean isPrime = true;
        if (k <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(k); i++) {
                if (k % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array1 = new int[n];
        inputArray(array1, scan);
        for (int i = 0; i < array1.length; i++) {
            if (isPrime(array1[i]) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}