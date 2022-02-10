import java.util.Scanner;

public class ArrayOperations {

    static void setZeroValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void arraySetValue(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    static void arrayIncrement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    static void arrayTopFive(int[] arr) {
        int count = 5;

        int lastMax = 999;
        while (count > 0) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max && arr[i] < lastMax) {
                    max = arr[i];
                }
            }
            System.out.println(max);
            lastMax = max;
            count--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        setZeroValue(arr);
        System.out.println("Enter " + arr.length + " values of the array");
        arraySetValue(arr);
        arrayIncrement(arr);
        System.out.println("Top 5 Scores :");
        arrayTopFive(arr);
    }
}