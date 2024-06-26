package ExamPreparation;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    price = 30;
                } else if (dates.equals("24-27")) {
                   price = 35;
                } else if (dates.equals("28-31")) {
                    price = 40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    price = 28;
                } else if (dates.equals("24-27")) {
                    price = 32;
                } else if (dates.equals("28-31")) {
                    price = 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    price = 32;
                } else if (dates.equals("24-27")) {
                    price = 37;
                } else if (dates.equals("28-31")) {
                    price = 43;
                }
                break;
        }
        double sum = nights * price;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);
    }
}
