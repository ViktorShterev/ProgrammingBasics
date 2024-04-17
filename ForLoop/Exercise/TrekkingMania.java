package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int sum = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                p1 += people;
            } else if (people < 13) {
                p2 += people;
            } else if (people < 26) {
                p3 += people;
            } else if (people < 41) {
                p4 += people;
            } else  {
                p5 += people;
            }
            sum += people;
            }

        double p1Per = 1.0 * p1 / sum * 100;
        double p2Per = 1.0 * p2 / sum * 100;
        double p3Per = 1.0 * p3 / sum * 100;
        double p4Per = 1.0 * p4 / sum * 100;
        double p5Per = 1.0 * p5 / sum * 100;

        System.out.printf("%.2f%%\n", p1Per);
        System.out.printf("%.2f%%\n", p2Per);
        System.out.printf("%.2f%%\n", p3Per);
        System.out.printf("%.2f%%\n", p4Per);
        System.out.printf("%.2f%%\n", p5Per);
    }

}


