public class MergeSortedArrays {
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] arr = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < arr1.length && k < arr2.length) {
            if (arr1[j] < arr2[k]) {
                arr[i] = arr1[j];
                j++;
                i++;
            } else {
                arr[i] = arr2[k];
                k++;
                i++;
            }
        }
        while (j < arr1.length) {
            arr[i] = arr1[j];
            j++;
            i++;
        }
        while (k < arr2.length) {
            arr[i] = arr2[k];
            k++;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5, 6, 7 };
        int[] arr2 = { 3, 4, 5, 10 };
        int[] arr = mergeArrays(arr1, arr2);
        System.out.println("Sorted Merged array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
