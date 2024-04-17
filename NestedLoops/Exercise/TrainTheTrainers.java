package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalGrades = 0;
        int count = 0;
        while (!input.equals("Finish")) {
            double sum = 0;
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }
            double average = sum / jury;
            totalGrades += average;
            count++;
            System.out.printf("%s - %.2f.\n", input, average);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrades / count);
    }
}
