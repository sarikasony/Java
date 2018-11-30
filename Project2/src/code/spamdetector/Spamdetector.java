/*Authors

 * ANIMESH BOTTA-999993826
 * SARIKA GUMMAPU-999994000*/

package code.spamdetector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Spamdetector {

	public static void main(String[] args) {
		Spamdetector spamdtr = new Spamdetector();
		System.out.println("Enter the filename:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		spamdtr.readLabels("src/code/spamdetector/dataset/" + name);
	}

	private void readLabels(String filename) {
		String f = "src/code/spamdetector/labels.txt";

		// trimming extra lines from the file url
		String filestr = filename.substring(filename.length() - 15, filename.length());

		try {
			String s = null;
			BufferedReader buf = new BufferedReader(new FileReader(f));
			int count = 0;
			String str;
			while ((str = buf.readLine()) != null) {
				s = str.substring(2, str.length());
				if (filestr.equals(s)) {
					count = 0;
					break;
				} else {
					count++;
				}
			}

			if (count == 0) {
				int spamcount = Integer.parseInt(str.substring(0, 1));
				if (spamcount == 1) {
					System.out.println("it is a HAM");
				} else {
					new ReadEml(filename);
				}
			} else {
				System.out.println("No file found");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
