import java.util.Scanner;

public class PrimeOrArmstrong {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int originalNum = n;
        int armstrongNo = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            armstrongNo += digit * digit * digit;
        }
        return (armstrongNo == originalNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime number");
            } else if (isArmstrong(i)) {
                System.out.println(i + " is an armstrong number");
            } else {
                System.out.println(i + " is neither an armstrong no. nor Prime no");
            }
        }
        scanner.close();
    }

}
