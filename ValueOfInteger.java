import java.util.Scanner;

public class ValueOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m :");
        int n;
        int m = sc.nextInt();
        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }
        System.out.println("n = " + n);
        sc.close();
    }
}
