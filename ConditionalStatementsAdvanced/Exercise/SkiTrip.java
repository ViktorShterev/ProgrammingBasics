package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = day - 1;
        double price = 0;
        switch (room){
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                if (day < 10){
                    price = (nights * 25) - nights * 25 * 0.3;
                } else if (day <= 15){
                    price = (nights * 25) - nights * 25 * 0.35;
                } else {
                    price = (nights * 25) - nights * 25 * 0.5;
                } break;
            case "president apartment":
                if (day < 10){
                    price = (nights * 35) - nights * 35 * 0.1;
                } else if (day <= 15){
                    price = (nights * 35) - nights * 35 * 0.15;
                } else {
                    price = (nights * 35) - nights * 35 * 0.2;
                } break;

        }
        if (feedback.equals("positive")){
            price = price + price * 0.25;
    } else {
            price = price - price * 0.1;
                }
        System.out.printf("%.2f", price);
    }
}
