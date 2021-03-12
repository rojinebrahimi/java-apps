package postfixcalculatorapp;
import java.util.Scanner;

public class EvaluatePostfix {
	
	public static void main(String[] args) {

//instantiation
//*************************************************************
		Evaluator eval = new Evaluator();

// local variables declaration and initialization
//*************************************************************
		String entry;
		double result = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

//asks the user to enter a postfix expression and pass it to the method
//*************************************************************		
		for(; ;) {
			
			System.out.println("Enter A Postfix Expression:('exit' To Quit) ");
			entry = input.nextLine();
			
			result = eval.evaluate(entry);
			System.out.println("THE RESULT: " + result);
		} 
	}
}
