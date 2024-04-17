package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double travel = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        double puzzleP = (double)puzzle * 2.6;
        int doll = Integer.parseInt(scanner.nextLine());
        double dollP = (double)(doll * 3);
        int bear = Integer.parseInt(scanner.nextLine());
        double bearP = (double)bear * 4.1;
        int minion = Integer.parseInt(scanner.nextLine());
        double minionP = (double)minion * 8.2;
        int truck = Integer.parseInt(scanner.nextLine());
        double truckP = (double)(truck * 2);
        int toys = puzzle + doll + bear + minion + truck;
        double toysP = puzzleP + dollP + bearP + minionP + truckP;
        if (toys >= 50) {
            toysP -= toysP * 0.25;
        }

        double rent = toysP * 0.1;
        if (toysP - rent >= travel) {
            System.out.printf("Yes! %.2f lv left.", toysP - rent - travel);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(toysP - rent - travel));
        }

    }
}
