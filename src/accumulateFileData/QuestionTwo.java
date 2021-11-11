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
	//accumulate file data questions 1-3
	public static void main(String args[]) {
		Scanner in = null;
		
		try {
			//question 2
			File file = new File("numberspractice.txt");
			in = new Scanner(file);
		}
		catch (FileNotFoundException e) {
		 System.out.println("File could not be opened");
		}
		if (in != null) {
			
			//question 2 and 3
			int x = 0;
			while(in.hasNextLine()) {
				//question 2
				x = in.nextInt() + x;		
			}
			//question 2 and 3
			System.out.print(x);
		}
	}
}

