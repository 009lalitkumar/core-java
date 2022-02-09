import java.util.Scanner;

public class LargestAndSmallest {
    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        }
        return c;
    }

    static int smallest(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Largest : " + largest(a, b, c));
        System.out.println("Smallest : " + smallest(a, b, c));
        sc.close();
    }

}
