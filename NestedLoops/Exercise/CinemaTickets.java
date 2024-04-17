package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        double sum = 0;
        while (!input.equals("Finish")){
            int freePlace = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            double hall = 0;
            while (!ticket.equals("End")){
                hall++;
                switch (ticket) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (hall >= freePlace){
                    break;
                }
                ticket = scanner.nextLine();
            }
            sum += hall;
            System.out.printf("%s - %.2f%% full.\n", input, hall / freePlace * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f\n", sum);
        System.out.printf("%.2f%% student tickets.\n", student / sum * 100);
        System.out.printf("%.2f%% standard tickets.\n", standard / sum * 100);
        System.out.printf("%.2f%% kids tickets.", kid / sum * 100);
    }}

