package Exam2;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food = scanner.nextLine();
        int pieces = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double sum = 0;
        switch (food){
            case "Cake":
                if (day <= 15){
                    price = 24;
                } else {
                    price = 28.7;
                }
                break;
            case "Souffle":
                if (day <= 15){
                    price = 6.66;
                } else {
                    price = 9.8;
                }
                break;
            case "Baklava":
                if (day <= 15){
                    price = 12.6;
                } else {
                    price = 16.98;
                }
                break;

            }
        sum = price * pieces;
        if (day <= 22){
            if (sum > 100 && sum < 200){
                sum = sum - sum * 0.15;
            } else if (sum > 200){
                sum = sum - sum * 0.25;
            }
        }
        if (day <= 15){
            sum = sum - sum * 0.1;
        }
        System.out.printf("%.2f", sum);
    }
}
