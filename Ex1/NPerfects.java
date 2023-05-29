import java.util.Scanner;

// Bài thực hành in ra các số hoàn hảo nhỏ hơn n với n được nhập từ bàn phím
//Kết quả in trên một dòng các số được cách nhau bởi một dấu cach

public class NPerfects
{
    // Hàm kiểm tra số n có phải là số hoàn hảo hay không
    // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong

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
    public static void printNPerfect(int n){
        for (int i=0; i< n; i++){
            if (isPerfect(i) == true) {
                System.out.print(i + " ");
            }
            
        }
    }
    public static void main(String []args)
    {
       
        
    }
    
}