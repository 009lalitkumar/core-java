import java.util.Scanner;

public class DigitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        while (num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }
        scanner.close();
    }
}
