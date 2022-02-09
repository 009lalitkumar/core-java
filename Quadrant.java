import java.util.Scanner;

public class Quadrant {

    static void findQuadrant(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x >= 0 && y >= 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y >= 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4th Quadrant");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x,y : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        findQuadrant(x, y);
        scanner.close();
    }
}
