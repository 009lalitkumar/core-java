import java.util.Scanner;

public class Grades {
    static char grade(int total) {
        if (total >= 90) {
            return 'A';
        } else if (total >= 80) {
            return 'B';
        } else if (total >= 70) {
            return 'C';
        } else if (total >= 60) {
            return 'D';
        } else if (total >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks in Physics, Chemistry and Maths Respectively:");
        int phy = scanner.nextInt();
        int chem = scanner.nextInt();
        int math = scanner.nextInt();
        int total = phy + chem + math;
        System.out.println("Total Marks : " + total);
        System.out.println("Grade : " + grade(total / 3));

        scanner.close();
    }
}
