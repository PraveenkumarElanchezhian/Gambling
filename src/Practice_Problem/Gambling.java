package Practice_Problem;

import java.util.Random;
import java.util.Scanner;
public class Gambling {
	static int cashStack = 100;
    static int amountStaked;
	public static void main(String[] args) {
		System.out.println("Welcome to my staking game.");
        while(cashStack > 0) {
            amountStaked();
            System.out.println("Rolling...");
            whoWon();
        }
        System.out.println("You have no more money.");
    }
    public static void amountStaked() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much would you like to stake?");
        amountStaked = scan.nextInt();
        System.out.println("You have chosen to stake, " + amountStaked + "$, goodluck.");
    }
    public static int roll() {
        Random r = new Random();
        int min = 0;
        int max = 100;
        int rolled = r.nextInt(max-min) + min;
        return rolled;
    }
    public static void whoWon() {
        int playerRoll = roll();
        int computerRoll = roll();
        System.out.println("You have rolled a " + playerRoll);
        System.out.println("Your oppent has rolled a " + computerRoll);
        if(playerRoll > computerRoll) {
            stakeWon(0);
        } else if (playerRoll < computerRoll) {
            stakeLost(0);
        } else {
            System.out.println("You guys tied.");
        }
    }
    	public static int stakeWon(int newAmount) {
        newAmount = cashStack + amountStaked;
        cashStack = newAmount;
        System.out.println("You have won the stake! You now have " + cashStack);
        return cashStack;
    }
    public static int stakeLost(int newAmount) {
        newAmount = cashStack - amountStaked;
        cashStack = newAmount;
        System.out.println("You have lost the stake.. You now have " + cashStack);
        return cashStack;
    }
	boolean win_loss() {
		int random_value = ((int) (Math.random() * 10) % 2);
		return random_value == 1 ? true : false;
	}
	int GetBalanceAmount(int Everyday_stack, int bet_amount) {
		return Everyday_stack - bet_amount;
	}
	int GetBalanceAmount(int balanceamount, int bet_amount, boolean winorloose) {
		return winorloose == true ? balanceamount + bet_amount : balanceamount;
	}
	double stack_winning_percentage(int Everyday_stack) {
		double stack_percentage = Everyday_stack + (Everyday_stack / 2);
		return stack_percentage;
	}
	double stack_loss_percentage(int Everyday_stack) {
		double stack_percentage = Everyday_stack - (Everyday_stack / 2);
		return stack_percentage;
		}
}
