package com.bridgelabz.HashMap;

public class HashMapMain {

	public static void main(String[] args) 
	{
		//UC1 - frequency of words in sentence
				HashMapService hashMap1 = new HashMapService();
				String givenSentence = "“To be or not to be”";
				String[] myStr1 = givenSentence.toLowerCase().split(" ");
				for (String string : myStr1)
				{
					hashMap1.put(string, 1);
				}
				hashMap1.print();
				
				//UC2 - frequency of words in paragraph
				HashMapService hashMap2 = new HashMapService();
				String givenParagraph= "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
				String[] myStr2 = givenParagraph.toLowerCase().split(" ");
				for (String string : myStr2)
				{
					hashMap2.put(string, 1);
				}
				hashMap2.print();
	}
}
