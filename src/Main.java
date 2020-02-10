import java.util.Scanner;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Choose the exercise:\n" +
                    "1. Exercise 1\n" +
                    "2. Exercise 2\n" +
                    "3. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Exercise_1 exercise1 = new Exercise_1();
                exercise1.printBear();
            } else if (choice == 2) {
                Exercise_2 exercise2 = new Exercise_2();
                System.out.println("Please enter the x-coordinates for the first point: ");
                int x = scanner.nextInt();
                System.out.println("Please enter the y-coordinates for the first point: ");
                int y = scanner.nextInt();
                Point p1 = new Point(x,y);
                System.out.println("Please enter the x-coordinates for the second point: ");
                x = scanner.nextInt();
                System.out.println("Please enter the y-coordinates for the second point: ");
                y = scanner.nextInt();
                Point p2 = new Point(x,y);
                exercise2.pointInfo(p1);
                exercise2.pointInfo(p2);
                exercise2.distance(p1,p2);
                exercise2.expected();
            } else if (choice == 3) {
                return;
            } else {
                System.out.println("Your selection is invalid!");
            }
        } while(flag);


    }
}
