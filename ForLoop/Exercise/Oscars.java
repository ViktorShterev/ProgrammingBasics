package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double finalPoints = points;
        for (int people = 1; people <= n ; people++) {
            String peopleName = scanner.nextLine();
            double peoplePoints = Double.parseDouble(scanner.nextLine());
            double currentPoints = (peopleName.length() * peoplePoints) / 2;
            finalPoints = finalPoints + currentPoints;
            if (finalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, finalPoints);
                break;
            }
        }

        if (finalPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - finalPoints);
        }
    }
}
