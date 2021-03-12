package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private String studentID;
	private String courses = "";
	private static int id = 1000; 
	
	//Constructor : prompt the user to enter the name and year
	public Student() {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter Student's First Name: ");
		this.firstName = Input.nextLine();
		
		System.out.print("Enter Student's Last Name: ");
		this.lastName = Input.nextLine();
		
		System.out.print("1.Freshman\n2.Sophomre\n3.Junior\n4.Senior\nEnter Student's Education Level: ");
		this.gradeYear = Input.nextInt();
		
		setStudentID();
	}
	//an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	//Enroll in courses
	
	public void enroll() {
		do {
			System.out.print("Enter The Name Of The course to enroll('q' or 'Q' to exit): ");
			Scanner Input = new Scanner(System.in);
			String course = Input.nextLine();
			if(!course.equals("Q") && !course.equals("q")) {
				courses += "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}
		while(1 != 0);
		
	}
	
	//Check the balance
	public void checkBalance() {
		System.out.println("\nHere Is Your Balance: " + tuitionBalance);
	}
	
	//Pay the tuition
	
	public void payTuition() {
		System.out.print("Type The Amount You Want To Pay: $");
		Scanner Input = new Scanner(System.in);
		double payment = Input.nextDouble();
		tuitionBalance -= payment; 
		System.out.println("Your New Balance Is: " + tuitionBalance);
	}
	
	//Show the status

	public void showInfo() {
		System.out.println("Name And Surname: " + firstName + " " + lastName);
		System.out.println("ID: " + studentID);
		System.out.println("Grade: " + gradeYear);
		System.out.println("Courses Enrolled: " + courses);
		System.out.println("Balance: $" + tuitionBalance);
		System.out.println("*************************");
		}
}
