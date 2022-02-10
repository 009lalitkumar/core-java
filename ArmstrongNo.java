import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();
        int originalNum = num;
        int armstrongNo = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            armstrongNo += digit * digit * digit;
        }
        System.out.println(armstrongNo == originalNum);
        scanner.close();
    }
}
