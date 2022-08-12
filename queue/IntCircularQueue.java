package com.datastructures.kangethe;

public class IntCircularQueue {

	int SIZE = 5;
	int front, rear;
	int[] items = new int[SIZE];

	public IntCircularQueue() {
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		} 
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full. ");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear  = (rear + 1) % SIZE;
			items[rear] = element;
			System.out.println("Inserted: "+ element);
		}
	}

	public int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {

				front = (front + 1) % SIZE;
			}
			return element;
		}
	}

	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % SIZE) {
				System.out.print(items[i] + " ");
			}
		    System.out.println(items[i]);
			System.out.println("Rear -> " + rear);
		}
	}
}
