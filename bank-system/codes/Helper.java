package banksystemapp;

import java.util.Scanner;

public class Helper {

	Scanner input = new Scanner(System.in);

// search by name method
// ******************************************************************
	public void searchAccountName(Account[] accounts) {

		System.out.print("Enter The Name You Are Looking For:");
		String inputName = input.nextLine();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {
				if (inputName.trim().equalsIgnoreCase(accounts[i].getName().trim())) {

					System.out.println("THE NAME EXISTS AMONG ACCOUNTS!");
					return;
				}
			}
		}

		System.out.println("NO NAME MATCH!");
	}

// group search method by a defined value
// ******************************************************************

	public void searchByBalance(Account[] accounts) {

		System.out.print("Enter The Amount Of Money You Want To Search The Accounts By: ");
		double amount = input.nextDouble();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].getBalance() > amount) {

					System.out.println(accounts[i].getName() + " " + accounts[i].getBalance());
				}
			}
		}
	}
// group search method by a defined value
// ******************************************************************

	public void searchByCardNumber(Account[] accounts) {

		System.out.print("Enter The Card Number You Are Looking For: ");
		String cnumber = input.nextLine();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].getCardNumber().equals(cnumber)) {

					System.out.println(accounts[i].getName() + " " + accounts[i].getCardNumber());
				}
			}
		}
	}

	// show information of an account method
	// ******************************************************************
	public void showInfo(Account[] accounts) {

		System.out.print("Enter your account PIN: ");
		int PIN = input.nextInt();

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				if (accounts[i].accountPIN == PIN) {

					System.out.println("Name: " + accounts[i].getName() + "\nAccount Number: "
							+ accounts[i].getCardNumber() + "\nBalance: " + accounts[i].getBalance());
					break;
				}
			}
		}
	}

	// show list of account owners method
	// ******************************************************************
	public void showListByName(Account[] accounts) {
		
		System.out.println("THE ACCOUNT OWNER(S): ");
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				
				System.out.println(accounts[i].getName());
			}
		}
	}

	// show all info
	// ******************************************************************

	public void showList(Account[] accounts) {

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {

				System.out.println("ACCOUNT INFO:");
				System.out.println("Name: " + accounts[i].getName() + "\nCard Number: "
						+ accounts[i].getCardNumber() + "\nBalance: " + accounts[i].getBalance()
						+ "\n********************");
			}
		}
	}
}
