public class DataTypes {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    public static void print() {
        System.out.println("byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bool + "\n");
    }

    public static void main(String[] args) {

        print();
        b = 1;
        s = 102;
        i = 999;
        l = 4324324;
        f = 23.542369f;
        d = 12.1235494854654;
        c = 'a';
        bool = true;
        System.out.println("After Assigning Values");
        print();

    }
}
