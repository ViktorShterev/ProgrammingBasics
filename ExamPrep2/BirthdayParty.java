package ExamPrep2;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());
        double cake = rent * 0.2;
        double drinks = cake - cake * 0.45;
        double animator = rent / 3;
        double sum = rent + cake + drinks + animator;
        System.out.printf("%.2f", sum);
    }
}
