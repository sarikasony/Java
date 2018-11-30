package code.spamdetector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadSpamWords {

	String[] spamtokens = new String[250];
	List<String> spamCategories;

	String[] list_employment = { "Earn", "$", "Money", "Making" };
	String[] fin_gnrl = { "Bargain", "$xxx", "fees", "Credit", "insurance" };
	String[] fin_business = { "Stock", "Cards", "investment", "business" };
	String[] gnrl = { "maintained", "hidden", "maintained", "wife" };
	String[] mrkt = { "ad", "marketing", "market", "sales", "sale", "Unsubscribe" };
	String[] free = { "free", "consultation", "offer", "membership", "investment" };

	String spamCtgry;
	
	private void readSpam() {
		String spamfile = "src\\code\\spamdetector\\spamwords.txt";
		spamCategories = new ArrayList<>();
		try {
			BufferedReader buf = new BufferedReader(new FileReader(spamfile));
			String str;
			int i = 0;
			while ((str = buf.readLine()) != null) {
				spamtokens[i] = str;
				i++;
			}

			for (int j = 0; j < i; j++) {
				if (spamtokens[j].equals("----")) {
					spamCategories.add(spamtokens[j + 1]);
				}
			}
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}

	public ReadSpamWords() {
		// readSpam();
	}

	private Set<String> spamsentences = new HashSet<>();
	
	public void checkSpam(String word) {
		
		for (int i = 0; i < list_employment.length; i++) {
			if (list_employment[i].equals(word))
			{
				spamCtgry = "Employment";
				spamsentences.add(word);
				
				

			}
		}
		
		for (int i = 0; i < fin_gnrl.length; i++) {
			if (fin_gnrl[i].equals(word))
			{
				spamCtgry = "Finance-general";
				spamsentences.add(word);
			

			}
		}
		
		for (int i = 0; i < fin_business.length; i++) {
			if (fin_business[i].equals(word))
			{
				spamCtgry = " Financial-Business ";
				spamsentences.add(word);
				

			}
		}
		
		for (int i = 0; i < gnrl.length; i++) {
			if (gnrl[i].equals(word))
			{
				spamCtgry = " General ";
				spamsentences.add(word);
				

			}
		}
		
		for (int i = 0; i < free.length; i++) {
			if (free[i].equals(word))
			{
				spamCtgry = " Free ";
				spamsentences.add(word);
				
			}
		}
		
		for (int i = 0; i < mrkt.length; i++) {
			if (mrkt[i].equals(word))
			{
				spamCtgry = " Marketing ";
				spamsentences.add(word);
				
			}
		}
		
		/*
		 * for (int i = 0; i < spamtokens.length; i++) { if (spamtokens[i] !=
		 * null) { spamsentences = spamtokens[i].split("\\t", 0);
		 * 
		 * for (String s : spamsentences) { if (s.equalsIgnoreCase(word)) {
		 * System.out.println(s); } } } }
		 */
	}
	
	public Set<String> getSpamSentences()
	{
		System.out.println("Total spam words:"+spamsentences.size());

		return spamsentences;
	}
	
	public String getCategory()
	{
		return spamCtgry;
	}
}
