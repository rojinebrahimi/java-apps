package banksystemapp;

import java.util.Scanner;

public class Account {

	// variables declaration

	private String name;
	private String cardNumber;
	protected int accountPIN;
	protected double balance;
	String year;
	String studentNumber;
	String bankNumber = "2019-1398-";

	Scanner input = new Scanner(System.in);

	// empty constructor
	public Account() {

	}

	// constructor formation
	// *****************************************************************
	public Account(String name, String studentNumber, String year, double initDeposit) {

		this.name = name;
		this.balance = initDeposit;
		this.studentNumber = studentNumber;
		this.year = year;
	}

	// create new account method
	// ******************************************************************
	public Account createAccount() {

		System.out.print("\nEnter Your Name And SurName, Please: ");
		this.name = input.nextLine();

		System.out.print("\nEnter The Year You Were Born(e.g. 1378): ");
		this.year = input.nextLine();

		System.out.print("\nEnter Your 10-digit Student Number(e.g. 1223456789): ");
		this.studentNumber = input.nextLine();

		this.cardNumber = setCardNumber();
		System.out.println("\nPlease Write Down Your Card Number For Later Use: " + this.cardNumber);

		this.accountPIN = setAccountPIN();
		System.out.println("\nHere Is Your Account PIN : " + this.accountPIN);

		System.out.println("\nACCOUNT CREATED SUCCESSFULLY!");
		return this;
	}

	// deposit method
	// ******************************************************************
	public Account[] deposit(Account[] accounts) {

		System.out.print("Enter Your Account PIN: ");
		int PIN = input.nextInt();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].getAccountPIN() == PIN) {

					System.out.print("Enter The Amount You Want To Deposit: ");
					double amount = input.nextDouble();
					accounts[i].balance += amount;
					System.out.println("Your Balance Is Now: " + accounts[i].balance + "Toman");
					break;
				}
			}
		}
		return accounts;
	}

	// withdraw method
	// ******************************************************************
	public Account[] withdraw(Account[] accounts) {

		System.out.print("Enter Your Account PIN: ");
		int PIN = input.nextInt();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].getAccountPIN() == PIN) {

					System.out.print("Enter The Amount You Want To Withdraw: ");
					double amount = input.nextDouble();

					if (accounts[i].balance >= 15000) {
						accounts[i].balance -= amount;
						System.out.println("Your Balance Is Now: " + accounts[i].balance + "Tomans");
					}
				}
			}
		}

		return accounts;
	}

	// transfer method
	// ******************************************************************
	public Account[] transfer(Account[] accounts) {

		System.out.print("Please Enter The Destination Card Number: ");
		String destinationCardNumber = input.nextLine();

		System.out.print("Enter Your Account PIN: ");
		int sourcePIN = input.nextInt();

		System.out.print("Please Enter The Amount You Want To Transfer: ");
		double amount = input.nextDouble();

		// represent default variables
		// ******************************************************************
		int sourceAccountIndex = -1;
		int destinationAccountIndex = -1;

		// iterate through accounts to retrieve source/destination index
		// ******************************************************************
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].accountPIN == sourcePIN)
					sourceAccountIndex = i;
				if (accounts[i].cardNumber.equals(destinationCardNumber))
					destinationAccountIndex = i;
			}
		}

		// input validation
		// ******************************************************************
		if (amount <= 0) {
			System.out.println("Invalid Amount!");
			return accounts;
		}

		if (sourceAccountIndex == -1) {
			System.out.println("Wrong PIN!");
			return accounts;
		}

		if (destinationAccountIndex == -1) {
			System.out.println("Wrong Destination Card Number!");
			return accounts;
		}

		// credit card validation
		// ******************************************************************
		if (accounts[sourceAccountIndex].balance < amount) {
			System.out.println("Not Enough Balance!");
			return accounts;
		}

		// decrement Source Deposit
		// ******************************************************************
		accounts[sourceAccountIndex].balance -= amount;

		// increment Destination Deposit
		// ******************************************************************
		accounts[destinationAccountIndex].balance += amount;

		System.out.println("Transfered " + amount + "Tomans Into Account With Number: "
				+ accounts[destinationAccountIndex].cardNumber + "!");
		return accounts;
	}

	// set card number method
	// ******************************************************************
	private String setCardNumber() {

		String lastTwoOfYear = year.substring(year.length() - 2, year.length());
		String lastTwoOfNumber = studentNumber.substring(studentNumber.length() - 2, studentNumber.length());
		int randomnumber = (int) (Math.random() * Math.pow(10, 4));
		return bankNumber + randomnumber + "-" + lastTwoOfNumber + lastTwoOfYear;
	}

	// set card number method
	// ******************************************************************
	public void setCardNumber(String cardNumber) {

		this.cardNumber = cardNumber;
	}

	// set accountPIN method
	// ******************************************************************
	private int setAccountPIN() {

		int PIN = (int) (Math.random() * Math.pow(10, 4));
		return PIN;
	}

	// getter for account pIN
	// ******************************************************************

	public int getAccountPIN() {
		return accountPIN;
	}

	// setter for name
	// ******************************************************************
	public void setAccountPIN(int PIN) {
		this.accountPIN = PIN;
	}

	// setter for name
	// ******************************************************************
	public void setName(String name) {
		this.name = name;
	}

	// getter method for name to access to private name variable
	// ******************************************************************
	public String getName() {
		return name;
	}

	// getter method to access the private card number variable
	// ******************************************************************
	public String getCardNumber() {
		return cardNumber;
	}

	// setter for balance
	// ******************************************************************
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// getter method to access the private balance variable
	// ******************************************************************
	public double getBalance() {
		return balance;
	}
}
