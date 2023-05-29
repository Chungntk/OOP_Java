public class RightTriangle {
    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) ;
        double b = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)) ;
        double c = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3)) ;
        System.out.println(a + " " + b + " " + c);
        if((a + b) > c) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        double a = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) ;
        double b = (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1) ;
        double c = (x2-x3)*(x2-x3) + (y2-y3)*(y2-y3) ;  
        return (a + b  == c) || (b + c == a) || (a + c == b);
    }
    public static void main(String [] args)
    {
        isTriangle(1, 2, 3, 6, 10, 20);
    }
}

