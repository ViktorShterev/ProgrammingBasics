package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apart = 0;
        double price1 = 0;
        double price2 = 0;
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apart = 65;
                if (nights > 7 && nights < 14) {
                    price1 = (studio * nights) - studio * nights * 0.05;
                    price2 = apart * nights;
                } else if (nights > 14) {
                    price1 = (studio * nights) - studio * nights * 0.3;
                    price2 = (apart * nights) - apart * nights * 0.1;
                } else {
                    price1 = studio * nights;
                    price2 = apart * nights;
                }
                break;
            case "June":
            case "September":
                studio = 75.2;
                apart = 68.7;
                if (nights > 14) {
                    price1 = (studio * nights) - studio * nights * 0.2;
                    price2 = (apart * nights) - apart * nights * 0.1;
                } else {
                    price1 = studio * nights;
                    price2 = apart * nights;
                }
                break;
            case "July":
            case "August":
                studio = 76;
                apart = 77;
                if (nights > 14) {
                    price2 = (apart * nights) - apart * nights * 0.1;
                    price1 = studio * nights;
                } else {
                    price1 = studio * nights;
                    price2 = apart * nights;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", price2, price1);
    }
}
