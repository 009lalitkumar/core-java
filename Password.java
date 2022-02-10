import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = sc.nextLine();
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            int ch = password.codePointAt(i);
            if (ch >= 97 && ch <= 122)
                lowercaseCount++;
            else if (ch >= 65 && ch <= 90)
                uppercaseCount++;
            else if (ch >= 48 && ch <= 58)
                digitCount++;
            else
                specialCharacterCount++;
        }
        System.out.println("Lowercases : " + lowercaseCount);
        System.out.println("Uppercases : " + uppercaseCount);
        System.out.println("Digits : " + digitCount);
        System.out.println("Special Character : " + specialCharacterCount);
        sc.close();
    }
}
