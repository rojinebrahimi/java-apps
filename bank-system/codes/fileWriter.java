package banksystemapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWriter {

//file to write contents	
//*************************************************************************************			

	public static void OutWriter(Account[] accounts) {

		try {

			FileWriter _fw = new FileWriter("D:\\total\\Eclipse\\BankSystemApp\\BankClients.txt");
			PrintWriter _pw = new PrintWriter(_fw);
			_pw.write("");
			_pw.flush();
			_pw.close();

			FileWriter fw = new FileWriter("D:\\total\\Eclipse\\BankSystemApp\\BankClients.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int j = 0; j < accounts.length; j++) {

				if (accounts[j] != null) {

					String name = accounts[j].getName();
					String cardNumber = accounts[j].getCardNumber();
					int accountPIN = accounts[j].accountPIN;
					String balance = Double.toString(accounts[j].getBalance());

					bw.write(name + "," + cardNumber + "," + balance + "," + accountPIN);
					bw.newLine();
					bw.flush();
				}
			}

			bw.close();

		} catch (IOException e) {

			System.out.println("FILE COULD NOT BE READ");
			e.printStackTrace();

		}
	}
}
