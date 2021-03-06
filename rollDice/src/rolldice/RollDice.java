package rolldice;

import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        int die1, die2;
        System.out.println("Can you roll doubles?");
        do {
            System.out.print("Press enter to roll the dice:");
            computerKeyboardInput.nextLine();
            die1 = rollDie();
            die2 = rollDie();
            printResult(die1, die2);
        } while (die1 != die2);
    }

    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void printResult(int die1, int die2) {
        if (die1 == die2) {
            System.out.printf("Doubles! You rolled two %d's. Thank you for playing! \n", die1);
        } else {
            System.out.printf("No doubles. You rolled a %d and a %d. Try again.\n", die1, die2);
        }
    }
}
