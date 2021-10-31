package Practice_Problem;

public class Gambling {
	public static void main(String[] args) {
		int Everyday_stack = 100;
		int bet_amount = 1;
		System.out.println("Everyday stack $" + Everyday_stack + ";" + " Bet amount $" + bet_amount);
		Gambling rv = new Gambling();
		int balanceamount = rv.GetBalanceAmount(Everyday_stack, bet_amount);
		boolean winorloose = rv.win_loss();
		System.out.println("$1 amount deducted for this game");
		System.out.println("Your current available balanace $" + balanceamount);
		System.out.println(winorloose == true ? "You won the game" : "You loose the game");
		System.out.println(
				"Your current available balanace $" + rv.GetBalanceAmount(balanceamount, bet_amount, winorloose));
	}

	boolean win_loss() {
		return ((int) (Math.random() * 10) % 2) == 1;
	}

	int GetBalanceAmount(int Everyday_stack, int bet_amount) {
		return Everyday_stack - bet_amount;
	}

	int GetBalanceAmount(int balanceamount, int bet_amount, boolean winorloose) {
		return winorloose == true ? balanceamount + bet_amount : balanceamount;

	}
}
