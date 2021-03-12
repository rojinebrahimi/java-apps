package postfixcalculatorapp;
import java.util.Scanner;

public class Evaluator {

//class variable declaration
// ***********************************************************
	double answer;

	public double evaluate(String str) {

//instantiation 
// ***********************************************************
		DoubleStack thestack = new DoubleStack();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

//checks if the user wants to quit
// ***********************************************************
		
		if(str.equalsIgnoreCase("EXIT")) {
			System.out.println("Have A Nice Day!...");
			System.exit(0);
		}
		
//checks the very first character of the string 
// ***********************************************************
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ')
				continue;

			if (Character.isLetter(ch)) {
				System.out.println("Enter The Amount Of " + ch + ", Please: ");
				double amounts = input.nextDouble();
				thestack.push(amounts);
			}

			else {
				double operand2 = thestack.pop();
				double operand1 = thestack.pop();

//checks for the sort of operator
// ***********************************************************
				switch (ch) {

				case '+':
					answer = operand1 + operand2;
					break;

				case '-':
					answer = Math.abs(operand1 - operand2);
					break;

				case '*':
					answer = operand1 * operand2;
					break;

				case '/':
					answer = operand1 / operand2;
					break;

				default:
					System.out.println("WRONG OPERATION USED!");
					break;
				}
				thestack.push(answer);
			}
		}
		return thestack.pop();
	}
}
