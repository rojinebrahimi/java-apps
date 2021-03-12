package banksystemapp;

import java.util.Scanner;

public class Menu {
	
 static int index = 0;

	public void MainMenu(Account[] accounts) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int option;
		boolean exit = false;
		Helper helper = new Helper();

		System.out.print("\t\t\tWELCOME TO ROJIN BANK IN ALZAHRA UNIVERSITY!\n\n");

		do {

			System.out.println("\n1.Create New Account\n2.Show Information Of Your Own Account\n"
					+ "3.Deposit\n4.Withdraw\n5.Transfer\n" + "6.Search A Name\n7.Search By Balance\n"
					+ "8.Show List By Name\n" + "9.Show List With Details\n" + "10.Search By Card Number\n"
					+ "11.Exit\n");
			System.out.print("Select The Opreration You Want To Be Done By Entering The Number: ");

			option = input.nextInt();

			switch (option) {

			case 1:

				accounts[index] = new Account().createAccount();
				index++;
				break;

			case 2:

				helper.showInfo(accounts);
				break;

			case 3:

				accounts = new Account().deposit(accounts);
				break;

			case 4:

				accounts = new Account().withdraw(accounts);
				break;

			case 5:

				accounts = new Account().transfer(accounts);
				break;

			case 6:

				helper.searchAccountName(accounts);
				break;

			case 7:

				helper.searchByBalance(accounts);
				break;

			case 8:

				helper.showListByName(accounts);
				break;

			case 9:

				helper.showList(accounts);
				break;

			case 10:

				helper.searchByCardNumber(accounts);
				break;
				
			case 11:

				exit = true;
				break;
			default:

				System.out.println("PLEASE ENTER THE NUMBER CORRECTLY!.");

				break;
			}
			
		} while (!exit);

		fileWriter.OutWriter(accounts);

		System.out.println("SEE YOU SOON!");

	}
}
