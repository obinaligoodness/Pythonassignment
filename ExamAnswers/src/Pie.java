import java.util.Arrays;

public class Pie {
    public static void main(String[] args) {
        double pie = 4;
        int denominator = 3;
        int numerator = 4;
        for (int counter = 1; counter <= 130657; counter++) {
            if (counter % 2 == 1) {
                pie = pie - (double) numerator / denominator;
            } else {
                pie = pie + (double) numerator / denominator;
            }
            denominator += 2;
            System.out.printf("%d  %.5f%n", counter, pie);
        }
    }
}
