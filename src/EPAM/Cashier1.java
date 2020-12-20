package EPAM;

class Cashier1 {

	void depTransfer(BankAccount acc, double val) {
		acc.deposit(val);
	}

	
	void withdraw(BankAccount acc, double val) {
		acc.withdraw(val);
		}
	
}