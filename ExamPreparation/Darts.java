package ExamPreparation;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String zone = scanner.nextLine();
        int total = 301;
        int count = 0;
        int badShots = 0;
        while (!zone.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            int finalPoints = 0;
            switch (zone) {
                case "Single":
                    finalPoints = points;
                    break;
                case "Double":
                    finalPoints = points * 2;
                    break;
                case "Triple":
                    finalPoints = points * 3;
            }
            if (finalPoints <= total) {
                count++;
                total -= finalPoints;
            } else {
                badShots++;
            }
            if (total == 0) {
                break;
            }
            zone = scanner.nextLine();
        }
        if (total == 0) {
            System.out.printf("%s won the leg with %d shots.", name, count);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, badShots);
        }
    }
}
