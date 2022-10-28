package chain.ATMBills.before;

public class ATM {
	
	public void withdraw(Integer ammount) {
		Integer remaining = ammount;
		System.out.println("Calculating bills set for $" + ammount);
		if(remaining >= 50) {
			int bills = remaining / 50;
			remaining %= 50;
			System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, 50, remaining);
		}
		if(remaining >= 10) {
			int bills = remaining / 10;
			remaining %= 10;
			System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, 10, remaining);
		}
		if(remaining >= 1) {
			int bills = remaining;
			remaining %= 1;
			System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, 1, remaining);
		}
	}
}
