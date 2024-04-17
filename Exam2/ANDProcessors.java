package Exam2;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int processor = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double hours = workers * days * 8;
        double processorFin = Math.floor(hours / 3);
        double processorEnd = 0;
        double money = 0;
        if (processorFin < processor){
            processorEnd = processor - processorFin;
            money = processorEnd * 110.10;
            System.out.printf("Losses: -> %.2f BGN", money);
        } else {
            processorEnd = processorFin - processor;
            money = processorEnd * 110.10;
            System.out.printf("Profit: -> %.2f BGN", money);
        }
    }
}
