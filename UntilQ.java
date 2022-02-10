import java.util.Scanner;

public class UntilQ {

    public static void main(String[] args) {
        int count = 0;
        char c;
        Scanner scanner = new Scanner(System.in);
        do {
            c = scanner.next().charAt(0);
            count++;
        } while (c != 'q');
        count--;
        System.out.println("Elements Inserted : " + count);
        scanner.close();
    }
}
