package banksystemapp;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileReader {

// file to read data
// *************************************************************************************
	public Account[] InReader(Account[] accounts) {

		String filePath = "D:\\total\\Eclipse\\BankSystemApp\\BankClients.txt";		
		String line;


		try {
			
			long lineCount = Files.lines(Paths.get(filePath)).count(); //to read the last line of the file 
			int index = (int) lineCount;

			FileReader file = new FileReader(filePath);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				line = scanner.nextLine();

				String[] param = line.split(",");

				String name = param[0];
				String cardNumber = param[1];
				double balance = Double.parseDouble(param[2]);
				int pin = Integer.parseInt(param[3]);

				Account temp = new Account();

				temp.setName(name);
				temp.setBalance(balance);
				temp.setAccountPIN(pin);
				temp.setCardNumber(cardNumber);

				accounts[index] = temp;
				index++;
			}

			scanner.close();

		} catch (IOException e) {

			System.out.println("FILE COULD NOT BE READ");
			e.printStackTrace();
		}

		return accounts;
	}
}
