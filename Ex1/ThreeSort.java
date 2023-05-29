import java.util.Scanner;

// Sắp xếp. Viết chương trình ThreeSort.java nhận 3 giá trị nguên từ dòng lệnh và 
// in ra màn hình 3 giá trị theo thứ tự tăng dần. Sử dụng hàm Math.min() và Math.max().


//Viết chương trình theo mô tả Bài 13 trong file Bài tập. 
//Đầu vào là 3 số nguyên nhận từ đối dòng lệnh, 
//kết quả là 3 số theo thứ tự tăng dần in trên 1 dòng. (dùng phương thức println in kết quả)

public class ThreeSort{
    public static void inputArray(int array[], Scanner scan){
        for(int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }
    public static void main(String agrs[]){
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        inputArray(array1, scan);
        for (int i=0; i<array1.length; i++){
            if(array1[i] == Math.max(array1[0], Math.max(array1[1], array1[2])))
                array2[2] = array1[i];
                if(array1[i] == Math.min(array1[0], Math.min(array1[1], array1[2])))
                    array2[0] = array1[i];
                    else
                        array2[1] = array1[0]+array1[1]+array1[2]-Math.max(array1[0], Math.max(array1[1], array1[2]))-Math.min(array1[0], Math.min(array1[1], array1[2]));
        }
        for (int i=0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }
}