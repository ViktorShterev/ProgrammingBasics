package ExamPreparation;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hall = Integer.parseInt(scanner.nextLine());
        double oscar = hall - hall * 0.3;
        double food = oscar - oscar * 0.15;
        double sound = food / 2;
        double sum = hall + oscar + food + sound;
        System.out.printf("%.2f", sum);
    }
}
