import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        exercise3();
    };

    public static void rollercoaster() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SuperFast RollerCoaster");
        System.out.print("Please enter your height in centimeters\n");
        int height = scanner.nextInt();

        /* if (height < 130) {
            System.out.println("Sorry, you are too short");
        }

        else if (height > 210) {
            System.out.println("Sorry, you are too tall.");
        }

        else {
            System.out.println("Height accepted. Go ahead");
        } */

        /* if (height < 130 || height > 210) {
            System.out.println("Sorry, you do not meet the height requirements");
        }
        else {
            System.out.println("Height accepted. Go ahead.");
        } */

        if (height > 130 && height < 210) {
            System.out.println("Height accepted. Go ahead.");
        }

        else {
            System.out.println("Sorry, you do not meet the height requirements");
        }
    };

    public static void stringEquality() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        /* if (age >= 70 || age >= 18 && vipPassReply.equals("yes") ) {
            System.out.println("Thanks, go on in.");
        }
        else {
            System.out.println("Sorry, no can do.");
        } */

        if (age >= 18 ) {

            if (age >= 70) {
                System.out.print("Thank you. Go on in.");
            }

            else {
                System.out.print("Do you have a VIP Pass? yes/no: ");
                String vipPassReply = scanner.next();

                if (vipPassReply.equals("yes") || age >= 70) {
                    System.out.println("Thanks, go on in.");
                } else {
                    System.out.println("Sorry, you must be over 70, or have a VIP Pass to enter.");
                }
            }

        } else {
            System.out.println("Sorry, you must be over 18.");
        }

    };

    public static void scoppy() {

        int numPets = 0;

        if (false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of pets you own: ");
            numPets = scanner.nextInt();
        }

        System.out.println("You have " + numPets + " pets.");
    }

    public static void switchStatement() {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("you eneterecd two.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
    }

    public static void exercise1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        System.out.println("First number: ");
        int x = scanner.nextInt();
        System.out.println("Second number: ");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.format("%d is bigger than %d", x, y);
        } else if (y > x) {
            System.out.format("%d is bigger than %d", y, x);
        } else {
            System.out.println("Both " + x + " and " + y + " are equal.");
        };

    }

    public static void exercise2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        System.out.println("First number: ");
        int x = scanner.nextInt();
        System.out.println("Second number: ");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.format("%d is bigger than %d\n", x, y);
            System.out.format("The difference between the two are %d", x-y);
        } else if (y > x) {
            System.out.format("%d is bigger than %d\n", y, x);
            System.out.format("The difference between the two are %d", y-x);
        } else {
            System.out.println("Both " + x + " and " + y + " are equal.");
        };

    }

    public static void exercise3() {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Please enter a number 1 to 5: ");
        int guess = scanner.nextInt();

        if(guess == randomNumber) {
            System.out.println("Correct! Aren't you lucky!");
        } else {
            System.out.println("Sorry, that isn't correct. Try again: ");
            int guess2 = scanner.nextInt();
            if(guess2 == randomNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println("Hard luck! Maybe next time!");
            }
        };

    };

};
