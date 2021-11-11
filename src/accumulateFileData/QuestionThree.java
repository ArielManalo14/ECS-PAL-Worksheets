/*
 * Ariel Manalo
 * 11/11/21
 * CSC15 PAL Worksheet
 * Accumulate file data
 * Question3
 */
package accumulateFileData;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class QuestionThree {
	//accumulate file data questions 1-3
	public static void main(String args[]) {
		Scanner in = null;
		
		try {
			//question 3
			File file = new File("intsAndNonIntsPractice.txt");
			
			in = new Scanner(file);
		}
		catch (FileNotFoundException e) {
		 System.out.println("File could not be opened");
		}
		if (in != null) {
			
			//question 2 and 3
			int x = 0;
			while(in.hasNextLine()) {
				//question 3
				if(in.hasNextInt()) {
					x = in.nextInt() + x;
				}
				else {
					in.nextLine();
				}
			}
			//question 2 and 3
			System.out.print(x);
		}
	}
}

