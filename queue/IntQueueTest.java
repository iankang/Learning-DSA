package com.datastructures.kangethe;

import com.datastructures.kangethe.IntQueue;

public class IntQueueTest {
	public static void main(String[] args) {
	    IntQueue q = new IntQueue();

	    // deQueue is not possible on empty queue
	    q.dequeue();

	    // enQueue 5 elements
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);

	    // 6th element can't be added to because the queue is full
	    q.enqueue(6);

	    q.display();

	    // deQueue removes element entered first i.e. 1
	    q.dequeue();

	    // Now we have just 4 elements
	    q.display();

	  }
}