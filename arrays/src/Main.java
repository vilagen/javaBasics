import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Exercise4();
    };

    public static void simpleArray() {
        int[] b = {75, 29, 350, 7, 4192};
        System.out.println((b[2]));
        b[3] = 51;
        System.out.println(b[3]);
        for (int i=0; i<5; i++){
            System.out.println(b[i]);
        }
    };

    public static void simpleArray2() {
        int[] nums = {75, 29, 350, 7, 4192, 87, 324};
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        for (int i= nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        // to go backwards
    };

    public static void simpleArray3() {
        int[] nums = {75, 29, 350, 7, 87, 324, 101};

        int count = 0;
        int sumOfNums = 0;

        for (int i=0; i<nums.length; i++){
            if(nums[i] > 100) {
                count++;
            };

            // Adding up all numbers
            sumOfNums = sumOfNums + nums[i];

        };


        System.out.format("Number of values greater than 100 is %d\n", count);
        System.out.format("Sum of all numbers is %d\n", sumOfNums);

        double mean = (double)sumOfNums / nums.length;
        System.out.println("Mean " + mean);

    }

    public static void simpleArray4() {
        int[] nums = {43, 9, 102, 78, 85, 141, 96};
        int[] numEx = new int[3];
        System.out.println(numEx[2]);
        // new int[3] will create a new int array of [0, 0, 0]

        double[] foo = {0.6, 22.81, 87.555};
        double[] bar = new double[3];
        System.out.println(bar[1]);

        boolean[] trueOrFalse = {true, false, false, true, false};
        boolean[] allFalse = new boolean[3];
        // new array would default to 3 elements of 'false' for allFalse array.

        Scanner scanner = new Scanner(System.in);

        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "very wealthy";

        System.out.print("I will predict your future. Choose 1, 2, or 3: ");
        int choice = scanner.nextInt();

        System.out.println("in your future you will be " + predictions[choice - 1]);
    };

    public static void simpleArray5() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of laps: ");
        int numberOfLaps = scanner.nextInt();

        double[] lapTimes = new double[numberOfLaps];

        for (int i=0; i < numberOfLaps; i++) {
            System.out.print("Lap time: ");
            lapTimes[i] = scanner.nextDouble();
        };

        double fastestTime = lapTimes[0];
        for (int i=0; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastestTime) {
                fastestTime = lapTimes[i];
            };
        };

        System.out.format("Fastest time: %.2f", fastestTime);
    };

    public static void Exercise1() {
        int[] foo = {58, 64, 187, 321, 41, 54, 87, 9556, 34, 82};
        for (int i=0; i < foo.length; i++) {
            System.out.println(foo[i]);
        };
    };

    public static void Exercise2() {
        int[] foo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                    11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i=0; i < foo.length; i++) {
            System.out.println(foo[i]);
        };

        for (int i=foo.length-1; i >= 0; i--) {
            System.out.println(foo[i]);
        };
    };

    public static void Exercise3() {
        double[] nums = { 5.84, 6.85, 7.00, 4.54, 6.17};

        double sum = 0;

        for( int i=0; i <nums.length; i++) {
            sum = sum + nums[i];
        };

        System.out.println(sum);

        System.out.println(sum / nums.length);

    }

    public static void Exercise4() {
        Scanner scanner = new Scanner(System.in);
        String[] favoriteFoods = new String[3];

        System.out.println("Please list your 5 favorite foods.");

        /* System.out.println("First: ");
        favoriteFoods[0] = scanner.nextLine();
        System.out.println("Second: ");
        favoriteFoods[1] = scanner.nextLine();
        System.out.println("Third: ");
        favoriteFoods[2] = scanner.nextLine();
        System.out.println("No more memory available."); */

        // another way to do this:
        for ( int i=0; i < favoriteFoods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            favoriteFoods[i] = scanner.nextLine();
        }

        System.out.println("No more memory available.");

        for( int i=0; i < favoriteFoods.length; i++) {
            System.out.println(favoriteFoods[i]);
        }

        // another way to do this:


    }
}
