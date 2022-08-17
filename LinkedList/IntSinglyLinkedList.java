package com.datastructures.kangethe;

import com.datastructures.kangethe.IntSinglyNode;

public class IntSinglyLinkedList {

	IntSinglyNode head;

	public void insertAtBeginning(int newData) {

		IntSinglyNode node = new IntSinglyNode(newData);
		node.next = head;
		head = node;
	}

	public void insertAfter(IntSinglyNode previousNode, int newData) {

		if (previousNode == null) {
			System.out.println("The previous node can't be empty");
			return;
		}

		IntSinglyNode newNode = new IntSinglyNode(newData);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
	}

	public void insertAtEnd(int data) {

		IntSinglyNode newNode = new IntSinglyNode(data);

		if (head == null) {

 			head = new IntSinglyNode(data);
 			return;
		}

		newNode.next = null;
		IntSinglyNode lastNode = head;

		while (lastNode.next != null) {

			lastNode = lastNode.next;
		}

		lastNode.next = newNode;
	}

	public void deleteNode(int position) {

		if (head == null) {

			return;
		}

		IntSinglyNode temp = head;

		if (position == 0) {

			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++) {

			temp = temp.next;
		}

		if (temp == null || temp.next == null) {

			return;
		}

		IntSinglyNode next = temp.next.next;
		temp.next = next;
	}

	public boolean search(int key) {

		IntSinglyNode current = head;

		while (current != null) {

			if (current.data == key) {

				return true;
			}

			current = current.next;
		}

		return false;
	}

	public void sortLinkedList() {

		IntSinglyNode current = head;
		IntSinglyNode index = null;
		int temp;

		if (head == null) {

			return;
		} else {

			while (current != null) {
				
				index = current.next;

				while (index != null) {

					if (current.data > index.data) {

						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}

				current = current.next;
			}
		}
	}

	public void printLinkedList() {
		
		IntSinglyNode node = head;

		while (node !=  null) {

			System.out.print(node.data +" ");
			node = node.next;
		}
	}

}