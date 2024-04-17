package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double coins = Math.floor(money * 100);
        int count = 0;
        while (coins > 0){
            if (coins >= 200){
                count++;
                coins -= 200;
            } else if (coins >= 100){
                count++;
                coins -= 100;
            } else if (coins >= 50){
                count++;
                coins -= 50;
            } else if (coins >= 20){
                count++;
                coins -= 20;
            } else if (coins >= 10){
                count++;
                coins -= 10;
            } else if (coins >= 5){
                count++;
                coins -= 5;
            } else if (coins >= 2){
                count++;
                coins -= 2;
            } else {
                count++;
                coins -= 1;
            }
        }
        System.out.println(count);
    }
}
