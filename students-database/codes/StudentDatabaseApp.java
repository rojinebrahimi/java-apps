package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.println("Enter The Number Of Students To Enroll: ");
		Scanner Input = new Scanner(System.in);
		int numberOfStudents = Input.nextInt();
		Student[] students = new Student[numberOfStudents];

		
		
		for(int i = 0; i < numberOfStudents; i++) {
		
			students[i] = new Student();
			students[i].enroll();
			students[i].checkBalance();
			students[i].payTuition();
		}
		
		for(int i = 0; i < numberOfStudents; i++) {
			students[i].showInfo();
		}
	}
}
