import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1;
        double num2;
        boolean x;
        System.out.println("\n***********  CALCULATOR  **********\n");
        do {
            System.out.println("Enter 2 Numbers to perform Operation on:");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            System.out.println("Choose Operation\n");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Modulus");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Can't Divide by 0\n");
                        break;
                    }
                    num1 = num1 / num2;
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Can't Take Modulus by 0\n");
                        break;
                    }
                    num1 = num1 % num2;
                    break;
                default:
                    System.out.println("Worng Choice,Try Again");
                    break;
            }
            if (choice > 0 && choice < 5) {
                System.out.println("Result = " + num1 + "\n");
            }
            System.out.println("Press 1 to continue, 0 to exit");
            x = sc.nextBoolean();
        } while (x);
        sc.close();
    }
}
