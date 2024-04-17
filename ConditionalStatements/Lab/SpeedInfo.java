package ConditionalStatements.Lab;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed <= 10.0) {
            System.out.print("slow");
        } else if (speed <= 50.0) {
            System.out.print("average");
        } else if (speed <= 150.0) {
            System.out.print("fast");
        } else if (speed <= 1000.0) {
            System.out.print("ultra fast");
        } else if (speed > 1000.0) {
            System.out.print("extremely fast");
        }

    }
}
