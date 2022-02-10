import java.util.Scanner;

public class HCF {
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / hcf(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Nos : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("HCF : " + hcf(a, b));
        System.out.println("LCM : " + lcm(a, b));

        scanner.close();
    }
}
