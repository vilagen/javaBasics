import java.util.Scanner;

public class Main {

    static int x = 5;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(add(13,6) * add(279, 163));
//        System.out.println(add(19, add(279, 163)));
//        System.out.println(coneVolume(4, 5));
//        references();

        Scanner scanner2 = new Scanner(System.in);

        System.out.println(x);
        foo4();
        bar2(scanner2);
    };

    // I think I have been using methods for awhile.

    public static void foo() {
        int x = 50;
        System.out.println(64);
        System.out.println(x);
    };

    public static void bar() {
        foo();
        System.out.println(12);
    };

    public static void foo2(int a) {
        System.out.println(a);
    };

    public static void bar2(int a, double b, String c) {
        System.out.println(a + b + " " + c);
        System.out.format(" %d + %.2f = %.2f and %s", a, b, a+b, c);
    };

    public static void foo3(int a) {
        if (a < 5) {
            return;
        }
        System.out.println(a);
    }

    public static int bar3() {
        return 49;
    }

    public static double bar30() {
        return 49.4;
    }

    public static int add(int a, int b) {
        return a + b;
    };

    public static double coneVolume(double r, double h) {
//        return 3.141 * r * r * h/3;
        return Math.PI * r * r * h/3;
    };

    public static void references() {
        int a = 10;
        int b = a;
        b = 20;

        int[] x = {3, 22, 4, 16, 8}; // x - 0x0035flab};
        int[] d = foo2(x);
        d[4] = 35;
        // so something to keep in mind; changing an array even for a new variable will change the original array as well.
//        int[] y = x;
//        int[] y = new int[5];
//        y[0] = 20;
//        x[3] = 9;
//        x = y;

//        Scanner sc = new Scanner(System.in);

//        x = new int[5];

        foo2(x);

        for(int i = 0; i < x.length; i++) {
            System.out.format("x[%d]: %d\n",i, x[i]);
        };

//        for(int i = 0; i < y.length; i++) {
//            System.out.format("y[%d]: %d\n",i, y[i]);
//        };

    };

    public static int[] foo2(int[] c) {
        c[1] = 50;
        return c;
    };

    public static void classes() {
        int x = 5;
        System.out.println(x);
    };

    public static void foo4() {
        scanner.nextDouble();
        System.out.println(x);
        x = 10;
    };

    public static void bar2(Scanner scanner){
        scanner.next();
        System.out.println(x);
    }

}
