package postfixcalculatorapp;

public class DoubleStack {

	// variable declaration
	// ***********************************************************
	private final int size = 50;
	private double item[];
	private int top;

	// constructor formation
	// ***********************************************************
	public DoubleStack() {

		item = new double[size];
		top = -1;
	}

	// push method
	// ***********************************************************
	public void push(double value) {

		if (top >= 50) {

			System.out.println("STACK OVERFLOW!");
		} else {

			item[++top] = value;
		}
	}

	// pop method
	// ***********************************************************
	public double pop() {

		if (top == -1)
			DoubleStack.isEmpty();

		return item[top--];
	}

	// checks if the entry is empty
	// ***********************************************************
	static public void isEmpty() {

		System.out.println("WRONG PHRASE ENTERED!");
	}
}
