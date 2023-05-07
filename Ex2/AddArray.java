/**
 * Chương trình cộng 2 mảng số nguyên: 
 * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
 * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
 * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
 * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
 * */

 import java.util.Scanner;

 class AddArray{
      public static void inputArray(int array[], Scanner scan)
      {
         for(int i=0; i<array.length; i++)
             array[i] = scan.nextInt();
      }
     // hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
     // .....{.......}
     public static int[] SumArray(int[] array1, int[] array2)
      {  
        int[] sumArr = new int [array1.length];
        for(int i=0; i<array1.length; i++){
            sumArr[i] = array1[i] + array2[i];
        };
        return sumArr;
      }
     // hàm/phương thức printArray để in một mảng A ra màn hình
     
     public static void printArray(int array[])
      {
         for(int i=0; i<array.length;i++)
             System.out.print(array[i] + " ");
      }
     
     public static void main(String args[]){
         //editing
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int[] array1 = new int [n];
         int[] array2 = new int [n];
         
         inputArray(array1, scan);
         inputArray(array2, scan);
         int[] sumArr = SumArray(array1, array2);
         printArray(sumArr);
     }
 }