package code.spamdetector;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadEml {

	private String[] token;
	private ReadSpamWords spamread;
	
	ReadEml(String name) {
		spamread = new ReadSpamWords();
		readFile(name);
	}

	/*private void regexEg() {
		String str = "he<\"l\">lo'$'#78suman";
		// Pattern pt = Pattern.compile("[a-zA-Z]");
		// Matcher match = pt.matcher(str);
		/*
		 * while(match.find()){ String s = match.group(); str =
		 * str.replaceAll("\\"+s, ""); }
		 */

		//System.out.println(str.replaceAll("[^a-zA-Z]+", ""));
	//}

	private void readFile(String name) {
		try {
			BufferedReader buf = new BufferedReader(new FileReader(name));
			String str;
	
			while ((str = buf.readLine()) != null) {
				str = str.replaceAll("[^a-zA-Z$]", " ");
				token = str.split("\\s",0);
				
				for(String s : token)
				{
					if(!s.equals(""))
					spamread.checkSpam(s);
				}	
			}
			
			System.out.println("Spam Category:\n--------------------\n "+spamread.getCategory());
			
			System.out.println("Keywords are: \n-----------------------\n");
			
			for(String s:spamread.getSpamSentences())
			{
				System.out.println(s);
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
