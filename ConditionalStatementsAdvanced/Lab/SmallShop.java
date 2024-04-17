package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());
        double price;
        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    price = 0.5 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Plovdiv")) {
                    price = 0.4 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Varna")) {
                    price = 0.45 * num;
                    System.out.printf("%f", price);
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    price = 0.8 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Plovdiv")) {
                    price = 0.7 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Varna")) {
                    price = 0.7 * num;
                    System.out.printf("%f", price);
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    price = 1.2 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Plovdiv")) {
                    price = 1.15 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Varna")) {
                    price = 1.1 * num;
                    System.out.printf("%f", price);
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    price = 1.45 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Plovdiv")) {
                    price = 1.3 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Varna")) {
                    price = 1.35 * num;
                    System.out.printf("%f", price);
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    price = 1.6 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Plovdiv")) {
                    price = 1.5 * num;
                    System.out.printf("%f", price);
                } else if (city.equals("Varna")) {
                    price = 1.55 * num;
                    System.out.printf("%f", price);
                }
        }

    }
}
