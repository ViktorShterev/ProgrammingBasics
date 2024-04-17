package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wide = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int volume = wide * length * high;
        int sumBox = 0;
        int sum = 0;
        String box = scanner.nextLine();
        while (!box.equals("Done")){
            int boxNum = Integer.parseInt(box);
           sumBox += boxNum;
            if (sumBox > volume){
                sum = volume - sumBox;
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sum));
                break;
            }
            sum = volume - sumBox;
            box = scanner.nextLine();
        }
        if (box.equals("Done")){
            System.out.printf("%d Cubic meters left.", sum);
        }
    }
}
