package banksystemapp;

import java.io.IOException;

//App By Rojin Ebrahimi
//Simple Banking System App
//************************************************************************

public class Bank {

	public static Account[] owner = new Account[300];

	public static void main(String[] args) throws IOException {
		
		owner = new fileReader().InReader(owner);
		
		new Menu().MainMenu(owner);
		
	}
}
