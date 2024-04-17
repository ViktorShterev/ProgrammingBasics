package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int goodGrades = 1;
        int poorGrades = 0;
        double allGrades = 0;
        boolean isExcluded = false;
        while (goodGrades <= 12) {

            if (poorGrades == 2) {
                isExcluded = true;
                break;
            }
            double current = Double.parseDouble(scanner.nextLine());
            if (current < 4) {
                poorGrades++;
                continue;
            }
            allGrades += current;
            goodGrades++;
        }
        double average = allGrades / 12;
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade", name, goodGrades);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
