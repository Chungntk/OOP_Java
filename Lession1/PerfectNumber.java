import java.util.Scanner;
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
class PerfectNumber
{
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
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (isPerfect(num) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}