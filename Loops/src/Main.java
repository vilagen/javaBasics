import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	 exercise6();
    }

    public static void whileLoop() {

        int i = 0;

        while( i < 10) {
            System.out.println("Test " + i);
//            i = i + 1;
//            i += 1;
            i++;
            // all three lines increment i by 1.
        }
    }

    public static void forLoop(){

        for (int i = 0; i < 10; i++) {
            System.out.println("For loop test " + i);
        }

        // this for loop is similar to what the while loop is performing on the other function.
        // technically, the system.out.println won't show at 10 because it is set to stop at 10.

        for (int i = 0; i <= 10; i++) {
            System.out.println("For loop test 2 " + i);
        }

        // this is one way to display the output for when i is 10.

        for (int i = 7; i <= 22; i++) {
            System.out.println("For loop test 2 " + i);
        }

        // this is showing you can have i technically start at a certain index, or point of the loop.

        for (int i = 1250; i >= 480; i--) {
            System.out.println("For loop test 3 " + i);
        };
        // this is showing you can decrement the 'i' in a for loop
        // just like you can increment it.
    };

    public static void breakAndContinue() {
        for (int i = 1; i <= 5; i++) {
            if(i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            if(i == 2) {
                continue;
                //this will make the loop continue for that specific loop, meaning it will not print out 2 when we run this.
            }
            System.out.println(i);
        }
    }

    public static void doWhileLoops() {

        int i = 0;

        do {
            i++;
            System.out.println(i);
        } while (i<5);

        // in do-while, the condition is checked first

        while (i < 5) {
            i++;
        }

        // in a while loop, condition is checked last.
    }

    public static void sixSidedDie() {

        Scanner scanner = new Scanner(System.in);

        String again;

        do {
            int num =ThreadLocalRandom.current().nextInt(1,7);
            // have to put "7", because first number is inclusive and last number is exclusive...meaning the 7 wouldn't be
            // counted. This will stop at 6, and of course begin at 1.
            System.out.println("You rolled a " + num + ".");
            System.out.println("Stop rolling? y/n: ");
            again = scanner.next();
        } while (!again.equals("y"));

    }

    public static void modulo() {

        System.out.println(23 % 5 == 0); // false
        System.out.println(23 % 5 == 3); // true
        System.out.println(20 % 5 == 0); // true

    }

    public static void exercise1() {

        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

    }

    public static void exercise2() {

        for (int i = 1; i <= 40; i++) {
            if (i % 3 == 0) {
                System.out.println("Quack");
            } else {
                System.out.println(i);
            }
        };
    };

    public static void exercise3() {

        Scanner scanner = new Scanner(System.in);

        String password = "shark50";
        String input;

        do {
            System.out.println(password);
            System.out.println("Please input your password: ");
            input = scanner.next();
        } while(input.equals(password));

    }
    public static void exercise4() {

        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.print( i + ".");
            } else {
                System.out.print(i + ", ");
            }
        };

    }

    public static void exercise5() {
        Scanner scanner = new Scanner(System.in);

        int num =ThreadLocalRandom.current().nextInt(1,101);
        int input;

        System.out.println(num);

        do {
            System.out.println("Please guess 1 to 100: ");
            input = scanner.nextInt();

            if( input > num ) {
                System.out.println("LOWER!");
            } else if ( input < num ) {
                System.out.println("HIGHER!");
            }
        } while(input!=num);
    }

    public static void exercise6() {

        Scanner scanner = new Scanner(System.in);

        int num =ThreadLocalRandom.current().nextInt(1,101);
        int input;
        int attempts = 1;

        System.out.println(num);

        do {
            System.out.println("Please guess 1 to 100: ");
            input = scanner.nextInt();

            if( input > num ) {
                System.out.println("LOWER!");
                attempts++;
            } else if ( input < num ) {
                System.out.println("HIGHER!");
                attempts++;
            } else {
                System.out.format("Correct! Your number of attempts were %d.\n", attempts);
                if(attempts == 1) {
                    System.out.println("Wow! You got it right on your first try! Lucky.");
                }
            }
        } while(input!=num);
    }

}
