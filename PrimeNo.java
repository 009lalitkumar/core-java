public class PrimeNo {
    static boolean isPrime(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPrime(n));
    }
}