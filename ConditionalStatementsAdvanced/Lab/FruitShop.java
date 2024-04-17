package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double pieces = Double.parseDouble(scanner.nextLine());
        double sum;
        switch (product) {
            case "banana":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 2.7;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 2.5;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "apple":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 1.25;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 1.2;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "orange":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 0.9;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 0.85;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "grapefruit":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 1.6;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 1.45;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "kiwi":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 3.0;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 2.7;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "pineapple":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 5.6;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 5.5;
                    System.out.printf("%.2f", sum);
                }
                break;
            case "grapes":
                if (!day.equals("Monday") && !day.equals("Tuesday") && !day.equals("Wednesday") && !day.equals("Thursday") && !day.equals("Friday")) {
                    if (!day.equals("Saturday") && !day.equals("Sunday")) {
                        System.out.println("error");
                    } else {
                        sum = pieces * 4.2;
                        System.out.printf("%.2f", sum);
                    }
                } else {
                    sum = pieces * 3.85;
                    System.out.printf("%.2f", sum);
                }
                break;
            default:
                System.out.println("error");
        }

    }
}
