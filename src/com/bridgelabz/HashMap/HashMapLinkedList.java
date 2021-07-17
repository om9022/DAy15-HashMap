package com.bridgelabz.HashMap;

public class HashMapLinkedList {
	HashNode head;

	public void add(String key , int value) 
	{

		HashNode newNode = new HashNode();
		newNode.key = key;
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}
	
	public HashNode search(String key)
	{
		HashNode traverse = head;
		while(traverse != null)
		{
			if(traverse.key.equals(key))
			{
				return traverse;
			}
			traverse = traverse.next;
		}
		return null;
		
	}

}
