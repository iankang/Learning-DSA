package com.datastructures.kangethe;

import com.datastructures.kangethe.IntSinglyLinkedList;

public class IntSinglyLinkedListTest {
	
	public static void main(String[] args) {

		IntSinglyLinkedList llist = new IntSinglyLinkedList();

	    llist.insertAtEnd(1);
	    llist.insertAtBeginning(2);
	    llist.insertAtBeginning(3);
	    llist.insertAtEnd(4);
	    llist.insertAfter(llist.head.next, 5);

	    System.out.println("Linked list: ");
    	llist.printLinkedList();

    	 System.out.println("\nAfter deleting an element: ");
	    llist.deleteNode(3);
	    llist.printLinkedList();

	    System.out.println();
	    int item_to_find = 3;
	    if (llist.search(item_to_find)) {
	      System.out.println(item_to_find + " is found");
	    } else {
	      System.out.println(item_to_find + " is not found");
	    }

		llist.sortLinkedList();
		System.out.println("\nSorted List: ");
		llist.printLinkedList();

	}
}