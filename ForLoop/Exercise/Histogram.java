package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else if (num <= 1000) {
                p5++;
            }
            }
        double p1Per = 1.0 * p1 / n * 100;
        double p2Per = 1.0 * p2 / n * 100;
        double p3Per = 1.0 * p3 / n * 100;
        double p4Per = 1.0 * p4 / n * 100;
        double p5Per = 1.0 * p5 / n * 100;
        System.out.printf("%.2f%%\n", p1Per);
        System.out.printf("%.2f%%\n", p2Per);
        System.out.printf("%.2f%%\n", p3Per);
        System.out.printf("%.2f%%\n", p4Per);
        System.out.printf("%.2f%%\n", p5Per);




    }
}
