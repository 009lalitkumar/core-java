import java.util.Scanner;

public class MatrixMultiplication {

    static void print2DArray(int[][] arr) {
        for (int[] i : arr) {
            for (int element : i) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] arr = new int[a.length][b[0].length];
        if (a[0].length != b.length) {
            arr = null;
            return arr;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    arr[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
        int[][] arr2 = { { 1, 1, 1 }, { 2, 2, 2 } };
        int[][] arr = matrixMultiplication(arr1, arr2);

        if (arr == null) {
            System.out.println("Can't multiply these arrays, due to size mismatch");
        } else
            print2DArray(arr);
        scanner.close();
    }
}
