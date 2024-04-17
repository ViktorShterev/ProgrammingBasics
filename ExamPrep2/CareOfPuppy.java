package ExamPrep2;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodAll = Integer.parseInt(scanner.nextLine());
        int food = foodAll * 1000;
        String input = scanner.nextLine();
        int sumGrams = 0;
        while (!input.equals("Adopted")){
            int grams = Integer.parseInt(input);
            sumGrams += grams;
            input = scanner.nextLine();
        }
        if (food >= sumGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.", food - sumGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", sumGrams - food);
        }
    }
}
