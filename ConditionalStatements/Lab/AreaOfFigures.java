package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double a;
        double h;
        if (figure.equals("square")) {
            a = Double.parseDouble(scanner.nextLine());
            h = a * a;
            System.out.printf("%.3f", h);
        } else {
            double areaTriangle;
            if (figure.equals("rectangle")) {
                a = Double.parseDouble(scanner.nextLine());
                h = Double.parseDouble(scanner.nextLine());
                areaTriangle = a * h;
                System.out.printf("%.3f", areaTriangle);
            } else if (figure.equals("circle")) {
                a = Double.parseDouble(scanner.nextLine());
                h = Math.pow(a, 2.0) * Math.PI;
                System.out.printf("%.3f", h);
            } else if (figure.equals("triangle")) {
                a = Double.parseDouble(scanner.nextLine());
                h = Double.parseDouble(scanner.nextLine());
                areaTriangle = 0.5 * a * h;
                System.out.printf("%.3f", areaTriangle);
            }
        }

    }
}
