package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int playPrice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int play = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                money += i * 5 - 1;
            } else {
                play++;

            }
        }
        double wallet = money + play * playPrice;
        if (wallet >= laundry) {
            System.out.printf("Yes! %.2f", wallet - laundry);
        } else {
            System.out.printf("No! %.2f", Math.abs(wallet - laundry));
        }

    }
}
