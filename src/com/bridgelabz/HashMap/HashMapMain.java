package com.bridgelabz.HashMap;

public class HashMapMain {

	public static void main(String[] args) 
	{
		HashMapService HashMap = new HashMapService();
		String givenString = "To be or not to be";
		String[] myStr = givenString.toLowerCase().split(" ");
		for (String string : myStr)
		{
			HashMap.put(string, 1);
		}
		HashMap.print();
	}
}
