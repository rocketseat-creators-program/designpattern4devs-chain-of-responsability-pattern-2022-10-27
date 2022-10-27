package chain.ATMBills.before;

public class Client {

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.withdraw(230);
		System.out.println("-----------");
		atm.withdraw(66);
	}
}
