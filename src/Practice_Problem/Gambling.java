package Practice_Problem;

public class Gambling {
	public static void main(String[] args) {
		int Everyday_stack = 100;
		int bet_amount = 1;
		int balanceamount = Everyday_stack;
		Gambling rv = new Gambling();
		double won_stock_percentage = 150; // rv.stack_winning_percentage(Everyday_stack);
		double loss_stock_percentage = 50; // rv.stack_loss_percentage(Everyday_stack);
		System.out.println("Everyday stack $" + Everyday_stack + ";" + " Bet amount $" + bet_amount);
		while (balanceamount < won_stock_percentage && balanceamount > loss_stock_percentage) {
			boolean winorloose = rv.win_loss();
			balanceamount = rv.GetBalanceAmount(balanceamount, bet_amount);
			System.out.println("$1 amount deducted for this game");
			System.out.println("Your current available balanace $" + balanceamount);
			System.out.println(winorloose == true ? "You won the game" : "You loose the game");
			// balanceamount = rv.GetBalanceAmount(balanceamount, bet_amount, winorloose);
			System.out.println("Your current available balanace $" + rv.GetBalanceAmount(balanceamount, bet_amount, winorloose));
		}
		System.out.println("Yours 50% stack is done today, SO your total amount is "+balanceamount);
	}

	boolean win_loss() {
		int random_value = ((int) (Math.random() * 10) % 2);
		//return random_value == 1 ? true : false;
		return true;
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
