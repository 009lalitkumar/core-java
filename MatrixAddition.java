import java.util.Scanner;

public class MatrixAddition {

    static void print2DArray(int[][] arr) {
        for (int[] i : arr) {
            for (int element : i) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] arr = new int[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) {
            arr = null;
            return arr;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arr[i][j] = a[i][j] + b[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr = matrixAddition(arr1, arr2);
        print2DArray(arr1);
        if (arr == null) {
            System.out.println("Can't add these arrays, due to size mismatch");
        } else
            print2DArray(arr);
        scanner.close();
    }
}
