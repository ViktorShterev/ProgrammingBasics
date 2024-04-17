package ExamPrep2;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int kcal = Integer.parseInt(scanner.nextLine());
        int sumKcal = min * 5 * walks;
        if (sumKcal >= kcal * 0.5){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", sumKcal);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", sumKcal);
        }
    }
}
