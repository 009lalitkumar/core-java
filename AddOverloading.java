class Add {
    Add() {
    }

    static int add(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

}

public class AddOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of Two no : " + Add.add(3, 4));
        System.out.println("Sum of Three no : " + Add.add(3, 4, 5));
        System.out.println("Sum of Four no : " + Add.add(3, 4, 5, 6));

    }
}
