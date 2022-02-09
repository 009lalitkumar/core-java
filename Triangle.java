import java.util.Scanner;

public class Triangle {
    static void triangleType(int a, int b, int c) {
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Triangle not Possible.");
        }
        if (a == b && b == c) {
            System.out.println("Triangle is Equilateral.");
        } else if (a == b || c == a || b == c) {
            System.out.println("Triangle is Isoceles");
        } else {
            System.out.println("Triangle is Scaline");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Sides of a triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        triangleType(a, b, c);

        sc.close();

    }
}
