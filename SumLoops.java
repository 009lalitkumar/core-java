import java.util.Scanner;

public class SumLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Loop 2 :");
        int i = 1;
        sum = 0;
        while (sum <= 100) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        i--;
        System.out.println("Sum Crosses 100 at " + i);
        scanner.close();
    }
}