public class CheckCondition {
    protected static boolean check(int a, int b) {
        return (a < 50 || a < b);
    }

    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        System.out.println(check(a, b));
    }
}
