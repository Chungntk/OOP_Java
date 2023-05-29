import java.util.Scanner;
//in ra cac so doi xung giua M và N
public class PalindromeNumbers{

    //ham kiem tra so nguyen k co la doi xung?
    //@para n kieu in
    //@return boolean
    public static boolean isPalindrome(int k)
    {
        String str = String.valueOf(k);
    
    // Use two pointers to compare characters from both ends of the string
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if (M < N){
            for (int i = M; i <= N; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
            }
            System.out.println();
        } else {
            for (int i = N; i <= M; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
            }
            System.out.println();
        }
        

    }

}
