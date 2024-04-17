package Exam2;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cats = Integer.parseInt(scanner.nextLine());
        int smallCat = 0;
        int normCat = 0;
        int bigCat = 0;
        double sumGrams = 0;
        for (int i = 1; i <= cats; i++) {
            double grams = Double.parseDouble(scanner.nextLine());
            if (grams < 200){
                smallCat++;
            } else if (grams < 300){
                normCat++;
            } else {
                bigCat++;
            }
            sumGrams += grams;
        }
        double kg = sumGrams / 1000;
        double price = kg * 12.45;
        System.out.printf("Group 1: %d cats.\n", smallCat);
        System.out.printf("Group 2: %d cats.\n", normCat);
        System.out.printf("Group 3: %d cats.\n", bigCat);
        System.out.printf("Price for food per day: %.2f lv.", price);
    }
}
