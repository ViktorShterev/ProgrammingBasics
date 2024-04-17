package Exam2;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        double liter100 = Double.parseDouble(scanner.nextLine());
        int distance = 2 * 384400;
        double time = Math.ceil(distance / speed);
        double fullTime = time + 3;
        double fuel = (liter100 * distance) / 100;
        System.out.printf("%.0f\n", fullTime);
        System.out.printf("%.0f", fuel);
        }
    }

