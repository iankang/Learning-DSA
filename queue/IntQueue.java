package com.datastructures.kangethe;

public class IntQueue {

  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  IntQueue() {
  	front = -1;
  	rear = -1;
  }

  boolean isFull() {
  	if (front == 0 && rear == SIZE - 1){
      return true;
    } 
    return false;
  }

  boolean isEmpty() {
    if(front == -1) {
      return true;
    } else {
      return false;
    }
  }

  public void enqueue(int element) {

    if (isFull()) {

      System.out.println("Queue is full");
    } else {
      if (front == -1) {
        front = 0;
      }
      rear++;
      items[rear] =  element;
      System.out.println("Inserted "+ element);
    }

  }

  public int dequeue(){
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } else {
        front++;
      }
      System.out.println("Deleted -> "+ element);
      return element;
    }
  }

  public void display(){
    int i;
    if (isEmpty()){
      System.out.println("Empty queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++) {
        System.out.print(items[i] + "  ");
      }

      System.out.println("\nRear index-> " + rear);
    }
  }

  // Queue implementation in Java

public class Queue {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front++;
      }
      System.out.println("Deleted -> " + element);
      return (element);
    }
  }

  void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      System.out.println("\nRear index-> " + rear);
    }
  }
}
  
}