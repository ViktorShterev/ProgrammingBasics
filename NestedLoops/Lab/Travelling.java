package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double price = Double.parseDouble(scanner.nextLine());
            int sum = 0;
            while (sum < price) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }

    }
}

