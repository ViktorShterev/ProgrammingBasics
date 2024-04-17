package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double fullTime = distance * time;
        double water = Math.floor(distance / 15.0) * 12.5;
        double endTime = fullTime + water;
        if (endTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", endTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", endTime - record);
        }

    }
}
