package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double ship = 0;
        switch (season) {
            case "Spring":
                ship = 3000;
                break;
            case "Summer":
            case "Autumn":
                ship = 4200;
                break;
            case "Winter":
                ship = 2600;
                break;

        }
        if (fishers <= 6) {
            ship = ship - ship * 0.1;
        } else if (fishers <= 11){
            ship = ship - ship * 0.15;
        } else {
            ship = ship - ship * 0.25;
        }
        if (fishers % 2 == 0 && (season.equals("Spring") || season.equals("Summer") || season.equals("Winter"))) {
            ship = ship - ship * 0.05;
        }
        if (budget >= ship){
            System.out.printf("Yes! You have %.2f leva left.", budget - ship);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - ship));
        }

    }}
