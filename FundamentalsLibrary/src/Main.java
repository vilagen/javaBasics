import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        quiz();
    };

    public static void studentScores() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of students");

        int numberOfStudents = scanner.nextInt();

        System.out.println("Input the maximum score.");

        int maxScore = scanner.nextInt();

        int[] testScores = new int[numberOfStudents];

        int allScores = 0;

        for( int i = 0; i < testScores.length; i++) {

            System.out.format("Please input Student %d's score: ", i+1);
            testScores[i] = scanner.nextInt();
            while(testScores[i] > maxScore) {
                System.out.println("Score input is higher than max score.");
                testScores[i] = scanner.nextInt();
            }
            double percentage = (double)testScores[i] / maxScore * 100;
            allScores += testScores[i];
            System.out.format("Student %d Score: %d; Grade: %.2f \n\n", i+1, testScores[i], percentage);

            if(i == numberOfStudents - 1) {
                double mean = (double)allScores / numberOfStudents;
                System.out.println("Mean: " + mean);
            }

        };

    };

    public static void quiz() {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"Blue and yellow = Green", "Lincoln was known for cutting a cherry tree.", "The car maker, Ford, is based in Japan.",
                                "Disney's first animated movie was Snow White.", "Nintendo's main mascot is Link."};

        boolean[] answers = {true, false, false, true, false};

        boolean[] userAnswers = new boolean[5];

        int score = 0;

        for( int i = 0; i < questions.length; i++) {

            System.out.println("Please answer 't' or 'f'.");

            System.out.println(questions[i] + " :");

            String answer = scanner.next();

            while ( !answer.equals("t") && !answer.equals("f") ) {

                System.out.println("Please choose either 't' or 'f'.");

                answer = scanner.next();
            };

            // this probably works because it will only be true if it's 't''
            // and since the array is a boolean, it would have mean the other answer is false.
            userAnswers[i] = answer.equals("t");

        };

        System.out.println("Your answers were:");

        for (boolean userAnswer : userAnswers) {
            System.out.println(userAnswer);
        };

        for ( int i = 0; i < userAnswers.length; i++) {

            if (answers[i] == userAnswers[i]) {
                score++;
            }

        };

        System.out.format("Your final score was %d", score);

    }

};
