package emailapp;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String alternativeEmail;
	private int mailboxCapacity = 200;
	private String email;
	private String companyName = "HomeCo.com";
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created!:" + this.firstName + " " + this.lastName + " ");
	
	this.department = setDepartment();
	//System.out.println("Your Email Department: "+ this.department);
	this.password = setPassword(8);
	//System.out.println("Your Password Is: "+ this.password);
	email = firstName.toLowerCase() + "." +  lastName.toLowerCase() + "@" + department + "." + companyName;
	//System.out.println("Your Email Address Is: "+ email);
	}



	private String setDepartment() {
		
		System.out.print("CHOICES:\n1.Sales\n2.Development\n3.Accounting\n4.None Of The Above\n");
		Scanner Input = new Scanner(System.in);
		int choice = Input.nextInt();
		
		if(choice == 1) {
			return "sales";
		}
		else if(choice == 2) {
			return "dev";
		}
		else if(choice == 3){
			return "acct";
		}
		else {
			return " ";
		}
	}
	
	
	
	
	private String setPassword(int len) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		char[] password = new char[len];
		for(int i = 0; i < len ;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	
	
	public void changePassword(String password) {
		this.password = password;
	}
	public void mailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public void alternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}
	
	
	
	
	public String getPassword() {
		return password;
	}
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	
	public String showInfo() {
		return "Your Name: " + firstName +
				"\nYour Family Name: " + lastName +
				"\nYour Department: " + department +
				"\nYour Password: " + password +
				"\nYour Email Address: " + email +
				"\nYour Mailbox Capacity: " + mailboxCapacity + " mb";
	}
}