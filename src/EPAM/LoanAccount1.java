package EPAM;

class LoanAccount1 implements BankAccount {
	double accbalance;

	LoanAccount1(double inibalance) {
		accbalance = inibalance;
	}

	@Override
	public void deposit(double amt) {
		accbalance = accbalance + amt;
		System.out.println("Deposit " + amt + " Rs.");
	}

	@Override
	public void withdraw(double amt) {
		accbalance = accbalance - amt;
		System.out.println("withdraw " + amt + " Rs.");
	}

	@Override
	public void balanceEnquiry() {

		System.out.println("Balance Amt is  " + accbalance + " Rs.");
	}

}
