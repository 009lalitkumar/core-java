import java.util.Scanner;

public class LeapYear {
    static boolean checkYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = s.nextInt();
        if (checkYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        s.close();
    }
}
