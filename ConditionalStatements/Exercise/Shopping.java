package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videoP = (double)(video * 250);
        double cpuP = videoP * 0.35 * (double)cpu;
        double ramP = videoP * 0.1 * (double)ram;
        double finalP = videoP + cpuP + ramP;
        if (video > cpu) {
            finalP -= finalP * 0.15;
        }

        double end = Math.abs(money - finalP);
        if (money >= finalP) {
            System.out.printf("You have %.2f leva left!", end);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", end);
        }

    }
}
