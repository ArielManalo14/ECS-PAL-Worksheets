/*
 * Ariel Manalo
 * 11/11/21
 * CSC15 PAL Worksheet
 * Accumulate file data
 * Question 4 and 5
 */
package accumulateFileData;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class QuestionFourAndFive {
	public static void main(String args[]) {
		Scanner inFile = null;
		try {
			//question 4
			File file = new File("intsPractice.txt");
			
			//question 5
			//File file = new File("multipleLinesInts.txt");
			inFile = new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("File could not be opened");
		}
		if( inFile!=null) {
			while (inFile.hasNextLine()) {
				String line = inFile.nextLine();
				Scanner inLine = new Scanner(line);
					 // Do something with inLine
				System.out.println(returnInt(inLine));
			}
		}
	}
	public static int returnInt(Scanner in) {
		int x=0;
		while(in.hasNextInt()) {
			x= in.nextInt() + x;
		}
		return x;
	}
}

