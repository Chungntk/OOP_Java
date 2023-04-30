public class NumberN {
    public static void main(String args[])
	{
		// truyen n tu dong lenh ham main
		int num = Integer.parseInt(args[0]);
        // N is divisible by 3  
        int divisor = 3;
        if (num % divisor == 0) {
            System.out.println(num + " is divisible by " + divisor + ".");
        } else {
            System.out.println(num + " is not divisible by " + divisor + ".");
        }
        // N is Prime
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        // N is perfect square
        double sqrt = Math.sqrt(num);
        int floorSqrt = (int) sqrt;
        if (sqrt - floorSqrt == 0) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
        // N is perfect number
        int sum = 0;
        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                sum += j;
            }
        }
        if (sum - num == 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
