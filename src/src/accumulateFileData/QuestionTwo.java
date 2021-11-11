/*
 * Ariel Manalo
 * 11/11/21
 * CSC15 PAL Worksheet
 * Accumulate file data
 * Question2
 */
package accumulateFileData;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class QuestionTwo {
	public static void main(String args[]) {
		Scanner in = null;
		try {
			File file = new File("numberspractice.txt");
			in = new Scanner(file);
		}
		catch (FileNotFoundException e) {
		 System.out.println("File could not be opened");
		}
		if (in != null) {
			int x = 0;
			while(in.hasNextLine()) {
				//question 2
				x = in.nextInt() + x;		
			}
			System.out.print(x);
		}
	}
}

