/**
 * Chương trình xóa phần tử trùng lặp trong mảng, chỉ để lại phần tử xuất hiện đầu tiên
 * import các thư viện (nếu cần thiết) - Bổ sung các phương thức/hàm (nếu cần thiết)
 * Giữ lại khung chương trình và phương thức xoaPhantu ở dưới
 * **/
import java.util.*;

public class XoaPTtrung{
    public static void inputMatrix(int array[], Scanner scan){
        for (int i=0; i<array.length; i++)
            array[i] = scan.nextInt();
    }
    //   xoaPhantu(int A[], int k){
         
    //      // bổ sung mã lệnh ở đây
         
    //  }
    public static int[] xoaPhantu(int[] array) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i])) {
                list.add(array[i]);
            }
        }
        
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        
        return newArray;
    }
     
     public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        // System.out.println("n = ");
        int n = scan.nextInt();
        int[] array = new int[n];
        // System.out.println("Nhap cac phan tu cua mang: ");
        inputMatrix(array, scan);
        int[] notDuplicateArray = xoaPhantu(array);
        for (int i=0; i<notDuplicateArray.length; i++)
            System.out.print(notDuplicateArray[i] + " ");
         // Nhập dữ liệu từ đây - bổ sung mã lệnh
     }
 }