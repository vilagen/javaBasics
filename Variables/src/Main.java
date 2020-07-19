public class Main {

    public static void main(String[] args) {
		typeCast();
    };

    public static void doubling() {
		int guitar = 100;
		double x = 2.5;
		double y = guitar - x;
		System.out.println(y);
	};

    public static void someInts() {
    	int x = 15;
    	System.out.println(x);
    	x = 32;
    	System.out.println(x);
    	x = -1000;
    	System.out.println(x);
    	// because java knows "x" is an integer, so don't have to keep declaring it's type.
		x = 2;
		int y = 3;
		x = x + y + x;
		// this will change what the value of x is
		System.out.println(x);
	};

    public static void moreInt() {
		int x;
		x = 15;
		System.out.println(x);
		System.out.println(15.0 / 6);
		// in order to get an answer of 2.5 like it should be, we have to make the number a double
		// We can do this by changing one of them, like 15, to 15.0.
		double a = 17;
		int b = 3;
		System.out.println(a/b);
	};

	public static void boo() {
    	int aNumber = 27;
    	double numberName = 14.27;
    	boolean hasDriversLicense = false;
    	// example of camelcase. And variables cannot start with a number.
    	char userInput = 65;
    	// there are different values for chars, like 65 equals a capitol A.
		String e = "England is Snowy";
		// String is a referenced data type, which is why it's not showing a special color like char, boolean, etc.
    	System.out.println( "Maine and " + e);
	};

	public static void typeCast() {
		int foo = 5;
		double bar = foo;

		// java can implicitly convert foo to double in this instance, but if trying to convert bar to foo, would normally fail.

		System.out.println(foo);
		System.out.println(bar);

		double foo2 = 2.95;
		int bar2 = (int)foo2;

		// can change if we specify foo2 to int.

		System.out.println(foo2);
		System.out.println(bar2);

		int foo3 = 17;
		int bar3 = 4;
		// how do we get the exact answer without making one of the numbers a double if that isn't an option?

		System.out.println((double)foo / bar);
		// type cast one of the variables in this instance.
	}

};
