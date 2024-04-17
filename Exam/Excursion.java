package Exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nightP = 20;
        double transportP = 1.6;
        int museumP = 6;
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transport = Integer.parseInt(scanner.nextLine());
        int museum = Integer.parseInt(scanner.nextLine());
        double sum = people * ((nights * nightP) + (museum * museumP) + (transport * transportP));
        double end = sum + sum * 0.25;
        System.out.printf("%.2f", end);
    }
}
