public class ArrayLargestSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 60, 7, 8, -9, 10 };
        int max = 0;
        int min = 999;
        for (int i : arr) {
            max = (i > max ? i : max);
            min = (i < min ? i : min);
        }
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);

    }
}