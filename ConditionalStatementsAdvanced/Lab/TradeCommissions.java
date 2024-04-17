package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double com;
        switch (city) {
            case "Sofia":
                if (sells >= 0.0 && sells <= 500.0) {
                    com = sells * 0.05;
                    System.out.printf("%.2f", com);
                } else if (sells > 500.0 && sells <= 1000.0) {
                    com = sells * 0.07;
                    System.out.printf("%.2f", com);
                } else if (sells > 1000.0 && sells <= 10000.0) {
                    com = sells * 0.08;
                    System.out.printf("%.2f", com);
                } else if (sells > 10000.0) {
                    com = sells * 0.12;
                    System.out.printf("%.2f", com);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sells >= 0.0 && sells <= 500.0) {
                    com = sells * 0.045;
                    System.out.printf("%.2f", com);
                } else if (sells > 500.0 && sells <= 1000.0) {
                    com = sells * 0.075;
                    System.out.printf("%.2f", com);
                } else if (sells > 1000.0 && sells <= 10000.0) {
                    com = sells * 0.1;
                    System.out.printf("%.2f", com);
                } else if (sells > 10000.0) {
                    com = sells * 0.13;
                    System.out.printf("%.2f", com);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sells >= 0.0 && sells <= 500.0) {
                    com = sells * 0.055;
                    System.out.printf("%.2f", com);
                } else if (sells > 500.0 && sells <= 1000.0) {
                    com = sells * 0.08;
                    System.out.printf("%.2f", com);
                } else if (sells > 1000.0 && sells <= 10000.0) {
                    com = sells * 0.12;
                    System.out.printf("%.2f", com);
                } else if (sells > 10000.0) {
                    com = sells * 0.145;
                    System.out.printf("%.2f", com);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }

    }
}
