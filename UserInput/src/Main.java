import javax.swing.text.Style;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        userInputName3();
    };

    public static void basicScanner(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
    };

    public static void userInputName(){
//        System.out.println(4.5-2.7);
//        System.out.format("I have %d cats, %.2f dollars, and 1 %s.", 7, 2.13, "panther");
//        System.out.format("\nWhen formatted: %.1f", 4.5 - 2.7);
        // %d is for integers, %f are for floats, and %s is for string
        // .2 is saying to round to 2 decimal places

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("\nHow tall are you in feet?");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + " feet tall.");

        double averageMaleHeightDif = userHeight - 5.6;
        double averageFemaleHeightDif= userHeight - 5.2;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%.2fft if you are male. \n", averageMaleHeightDif);
        System.out.format("%.2fft if you are female. \n", averageFemaleHeightDif);
    };

    public static void userInputName2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
//        String firstName = scanner.next();
//        String lastName = scanner.next();
        // nextLine can read the entire line instead of just 1 token at a time.
        String name = scanner.nextLine();
        System.out.println( name + " is your name.");
    };

    public static void userInputName3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("Your name has %d characters.\n", firstName.length());
        System.out.format("You have £%.2f on you and need £%.2f.\n", money, moneyNeeded);
        System.out.format("You have lived %d years. In another %d years you'll be %d years old.", age, age, age * 2);
    }

    public static void restaurantBill(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Restaurant Bill: ");
        double bill = scanner.nextDouble();

        System.out.println("Amount of customer: ");
        int customers = scanner.nextInt();

        System.out.format("Each customer would pay %.2f.", bill / customers);
    }
};
