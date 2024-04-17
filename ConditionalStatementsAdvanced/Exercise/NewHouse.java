package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int pieces = Integer.parseInt(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if ("Roses".equals(flower)) {
            double sum = pieces * 5;
            if (pieces > 80) {
                sum = sum - sum * 0.1;
            }
            if (money >= sum) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flower, money - sum);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(money - sum));
            }
        } else if ("Dahlias".equals(flower)) {
             double sum = pieces * 3.8;
            if (pieces > 90) {
                sum = sum - sum * 0.15;
            }
            if (money >= sum) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flower, money - sum);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(money - sum));
            }
        } else if ("Tulips".equals(flower)) {
            double sum = pieces * 2.8;
            if (pieces > 80) {
                sum = sum - sum * 0.15;
            }
            if (money >= sum) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flower, money - sum);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(money - sum));
            }
        } else if ("Narcissus".equals(flower)) {
            double sum = pieces * 3;
            if (pieces < 120) {
                sum = sum + sum * 0.15;
            }
            if (money >= sum) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flower, money - sum);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(money - sum));
            }
        } else if ("Gladiolus".equals(flower)) {
            double sum = pieces * 2.5;
            if (pieces < 80) {
                sum = sum + sum * 0.2;
            }
            if (money >= sum) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flower, money - sum);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(money - sum));
            }
        }
          }}