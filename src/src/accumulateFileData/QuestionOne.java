/*
 * Ariel Manalo
 * 11/11/21
 * CSC15 PAL Worksheet
 * Accumulate file data
 * Question1
 */
package accumulateFileData;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class QuestionOne {
	public static void main(String args[]) {
		Scanner in = null;
		try {
			File file = new File("scannerpractice.txt");
			in = new Scanner(file);
		}
		catch (FileNotFoundException e) {
		 System.out.println("File could not be opened");
		}
		if (in != null) {
			while(in.hasNextLine()) {
				//question 1
				System.out.println(in.nextLine());
			}
		}	
	}
}
