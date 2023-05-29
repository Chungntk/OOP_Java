// Viết chương trình tính exp theo công thức khai triển Taylor được mô tả trong file Đề bài tinh_exp.pdf
// Khuôn mẫu các phương thức và lớp cần được giữ nguyên 
// Có thể bổ sung thêm các phương thức khác nếu cần!

import java.lang.Math.*;

public class Exp {
    // Calculate the factorial of a number
    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    
    // Calculate and return the approximate value of e^x
    public static double dblExp(double x, int n) {
        double result = 0.0;
        
        for (int i = 0; i <= n; i++) {
            result += Math.pow(x, i) / factorial(i);
        }
        
        System.out.println(Math.round(result * 1000.0)/1000.0);
        return Math.round(result * 1000.0)/1000.0;
    }
    
    public static void main(String[] args) {
        double x = 2.0;  // Example value for x
        int n = 10;     // Example value for n
        
        double approximateValue = dblExp(x, n);
        System.out.println("Approximate value of e^" + x + " using " + n + " terms: " + approximateValue);
    }
}