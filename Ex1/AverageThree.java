public class AverageThree {
    public static void main(String[] args) {
        String x1 = args[0];
        String x2 = args[1];
        String x3 = args[2];
        double n1 = (Double.parseDouble(x1));
        double n2 = (Double.parseDouble(x2));
        double n3 = (Double.parseDouble(x3));
        double average = (n1 + n2 + n3) / 3;
        System.out.println(average);
    }
}
