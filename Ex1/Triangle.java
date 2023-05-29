class Triangle
{
    static boolean isTriangle(double a, double b, double c)
    {
        if((a + b) > c) {
            return true;
        } else {
            return false;
        }
            
    }
    static double getArea(double a, double b, double c)
    {
        if (isTriangle(a, b, c) == true){
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        } else {
            return 0;
        }
    }
    public static void main(String [] args)
    {
        
    }
}