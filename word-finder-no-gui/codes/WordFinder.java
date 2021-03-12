package wordfinder;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordFinder {
	public static void main(String[] args) {

		// declaration and initialization
		String text = new String();
		String inputWords;
		Scanner in = new Scanner(System.in);
		IOFile f = new IOFile();
			// Menu
			System.out.println("\n\t\tWELCOME TO ROJIN'S WORD FINDER APP!");

			// opening a written file
			System.out.println("Enter The Words You Want To Be Searched: ");
			inputWords = in.nextLine();
			f.IOfile(inputWords);
	}
}
