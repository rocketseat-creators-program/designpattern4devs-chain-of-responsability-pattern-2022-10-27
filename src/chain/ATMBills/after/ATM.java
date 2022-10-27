package chain.ATMBills.after;

public class ATM {
	private Bill chain;
	
	public ATM() {
		chain = new Bill(200,
						new Bill(100,
							new Bill(50,
								new Bill(20,
									new Bill(10, null)))));
	}
	
	public ATM(Bill... bills) {
		for(int index = 0; index < bills.length -1; index++) {
			Bill currentBill = bills[index];
			currentBill.setNext(bills[index + 1]);
		}
		chain = bills[0];
	}
	
	public void withDraw(Integer amount) {
		chain.execute(amount);
	}
}
