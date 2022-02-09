public class Swap {
    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped Values:\na = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        System.out.println("Initially\na = " + a + " b = " + b);
        swap(a, b);
    }
}
