package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        double money = 0;
        String stay = "";
        if (budget <= 100){
            place = "Bulgaria";
        switch (season){
            case "summer":
                money = budget * 0.3;
                stay = "Camp";
                break;
            case "winter":
                money = budget * 0.7;
                stay = "Hotel";
                break;
        }}
         else if (budget > 100 && budget <= 1000){
            place = "Balkans";
        switch (season){
            case "summer":
                money = budget * 0.4;
                stay = "Camp";
                break;
            case "winter":
                money = budget * 0.8;
                stay = "Hotel";
                break;
        }}
        else if (budget > 1000) {
            place = "Europe";
        switch (season){
            case "summer":
               case "winter":
                money = budget * 0.9;
                stay = "Hotel";
                break;
        }}
System.out.printf("Somewhere in %s%n%s - %.2f", place, stay, money);

    }
}
