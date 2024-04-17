package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double theme = budget * 0.1;
        double clothesSum = clothes * (double)statist;
        if (statist > 150) {
            clothesSum -= clothesSum * 0.1;
        }

        if (clothesSum + theme > budget) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", clothesSum + theme - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - (clothesSum + theme));
        }

    }
}
