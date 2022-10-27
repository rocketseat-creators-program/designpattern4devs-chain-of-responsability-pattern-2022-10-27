package chain.ATMBills.after;

public class Client {

	public static void main(String[] args) {
		ATM ATM = new ATM();
		System.out.println("Withdrawing $230...");
		ATM.withDraw(230);
		System.out.println("Withdrawing $1589...");
		ATM.withDraw(1589);
		
		ATM customATM = new ATM(new Bill(256), new Bill(128), new Bill(64)
				, new Bill(32), new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
		System.out.println("Withdrawing $230...");
		customATM.withDraw(230);
		System.out.println("Withdrawing $1589...");
		customATM.withDraw(1589);
	}
}
