public class Operators {
    public static void main(String[] args) {
        int result = 8;
        result += 2345;
        result /= 3;
        result %= 5;
        result *= 5;
        System.out.println(result);

        System.out.println((8 + 2345) / 3 % 5 * 5);
    }
}
