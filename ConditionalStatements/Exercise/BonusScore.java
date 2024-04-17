package ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double points = 0.0;
        if (num <= 100) {
            points = 5.0;
        } else if (num <= 1000) {
            points = (double)num * 0.2;
        } else {
            points = (double)num * 0.1;
        }

        if (num % 2 == 0) {
            ++points;
        } else if (num % 10 == 5) {
            points += 2.0;
        }

        System.out.printf("%.1f%n", points);
        double sum = points + (double)num;
        System.out.printf("%.1f%n", sum);
    }
}
