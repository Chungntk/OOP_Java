import java.util.Scanner;
import java.util.ArrayList;

public class ManageBabies {
	
    
	
	/*  Nhap vao thong tin cua n baby tu ban phim. Cac thong tin theo thu tu ten, ngay thang nam sinh, gioi tinh
	gioi tinh, can nang, chieu cao
	*/
	
	// nhap vao so nguyen duong n va thong tin cua n baby
	Baby[] createData (Scanner sc)
	{
	    int n = Integer.parseInt(sc.nextLine());
        Baby[] babies = new Baby[n];
	    for(int i = 0; i < n; i++){
	        String bbName = sc.nextLine();
            String bbDay = sc.nextLine();
            Boolean bbGender = Boolean.parseBoolean(sc.nextLine());
            Double bbWeight = Double.parseDouble(sc.nextLine());
            Double bbLength = Double.parseDouble(sc.nextLine());
            babies[i] = new Baby(bbName, bbDay, bbGender, bbWeight, bbLength);
	    }
        return babies;
	    
	}
	
	 // In ra thong tin cua n baby sau khi chuan hoa ho ten
	void printInforBabies (Baby babies[])
	{
        for (int i = 0; i < babies.length; i++) {
            System.out.println(babies[i].toString());
        }
	    
	}
	// Sap xep cac baby theo trong luong giam dan
	void sortWeight (Baby babies[])
	{
	    for (int i = 0; i < babies.length; i++) {
            for (int j = 0; j < babies.length; j++) {
                if(babies[i].getWeight() < babies[j].getWeight()) {
                    Baby temp = babies[i];
                    babies[i] = babies[j];
                    babies[j] = temp;
                }
            }
        }
	}
	// Loc ra tat ca nhung baby co gioi tinh la gender
	void filterGender(Baby babies[], String gender)
	{
	    for (int i = 0; i < babies.length; i++) {
            if(babies[i].getGender() == gender)
                System.out.println(babies[i].toString());
        }
	}
    
	public static void main(String[] args) {
        
	}

}
