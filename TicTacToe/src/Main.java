import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[] pos = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn = 1;

        while(true) {

            System.out.print("Enter a position: ");
            input = scanner.nextInt();

            if(input >= 10 || input <= 0 ) {
                System.out.println("Please choose an input between 1 and 9");
                continue;
            } else if (pos[input -1] == 'X' || pos[input -1] == 'O') {
                System.out.println("Space is already taken. Please choose an empty spot.");
                continue;
            }

            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn ||
                    pos[3] == turn && pos[4] == turn && pos[5] == turn ||
                    pos[6] == turn && pos[7] == turn && pos[8] == turn ||
                    pos[0] == turn && pos[3] == turn && pos[6] == turn ||
                    pos[1] == turn && pos[4] == turn && pos[7] == turn ||
                    pos[2] == turn && pos[5] == turn && pos[8] == turn ||
                    pos[6] == turn && pos[4] == turn && pos[2] == turn ||
                    pos[0] == turn && pos[4] == turn && pos[8] == turn) {
                System.out.format("Congratulations, %c won the game!", turn);
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            };

            currentTurn++;

            if (currentTurn > 9) {
                System.out.println("DRAW!");
                break;
            }

        }
    };
}
