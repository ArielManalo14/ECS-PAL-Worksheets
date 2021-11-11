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
	public static void main(String args[]) {
		Scanner in = null;
		try {
			File file = new File("intsAndNonIntsPractice.txt");
			in = new Scanner(file);
		}
		catch (FileNotFoundException e) {
		 System.out.println("File could not be opened");
		}
		if (in != null) {
			int x = 0;
			while(in.hasNextLine()) {
				if(in.hasNextInt()) {
					x = in.nextInt() + x;
				}
				else {
					in.nextLine();
				}
			}
			System.out.print(x);
		}
	}
}

