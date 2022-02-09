public class EvenOddNumber {
    static void checkNumber(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is an Even Number");
        } else {
            System.out.println(x + " is an Odd Number");
        }
    }

    public static void main(String[] args) {
        int x = 6;
        checkNumber(x);
    }
}
