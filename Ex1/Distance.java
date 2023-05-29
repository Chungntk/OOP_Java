import java.util.Scanner;

public class Distance {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return Math.round(distance * 100.0) / 100.0;
    }

    public static void main(String[] args) {

    }
}

public class Distance {
    public static void main(String[] args) {
        double x1 = (Double.parseDouble(args[0]) );
        double y1 = (Double.parseDouble(args[1]) );
        double x2 = (Double.parseDouble(args[2]) );
        double y2 = (Double.parseDouble(args[3]) );
        double distance = Math.round(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) * 100.0) / 100.0;
        System.out.println(distance);
    }
}
