package com.bridgelabz.HashMap;

public class HashMapLinkedList {

	HashNode head;

	// method to add node in linked list
	public void add(String key , int value) 
	{

		HashNode newNode = new HashNode();
		newNode.key = key;
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}

	// method to search a particular node from linked list
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

	// method to delete a node from the linked list
	public void delete(String key)
	{
		// checks if head is null
		if(head == null)
		{
			System.out.println("The Link List is empty");
		}
		// checks if key is at head
		else if (head.key.compareTo(key) == 0)
		{
			System.out.println(head.key+" Removed");
			head = head.next;
		}

		//find key and delete it
		else
		{	
			HashNode endNode = head;
			HashNode currentNode = endNode;
			while(endNode.next != null && endNode.key != key)
			{
				currentNode = endNode;
				endNode = endNode.next;
			}
			if(endNode.key.compareTo(key) == 0)
			{
				currentNode.next = endNode.next;
				System.out.println(endNode.key+" Removed ");
			}
			else
			{
				System.out.println(key+" Not Found");
			}
		}
		
	}

}
