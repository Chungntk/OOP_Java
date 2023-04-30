public class SumCalculate {
    public static void main(String args[])
	{
		// truyen n tu dong lenh ham main
		int num = Integer.parseInt(args[0]);
        int i, sum = 0;  
        //executes until the condition returns true  
        for(i = 1; i <= num; ++i)  
        {  
        //adding the value of i into sum variable  
        sum = sum + i;  
        }
        System.out.println("\n Tong cac so tu 1 toi "+ num + " la: " + sum);
        // sum even number  
        int evensum = 0;

        for (i = 2; i <= num; i += 2)  
        {  
        evensum += i;  
        }
        System.out.println("\n Tong cac so chan nho hon "+ num + " la: " + evensum);
        // Tong cac phan so 1/i
        double fracsum = 0.0;
        for (i = 1; i <= num; ++i)  
        { 
        fracsum += 1.0/i;  
        }
        System.out.println("\n Tong cac phan so co mau so nho hon " + num + " la: " + fracsum);  
    }
    
}
