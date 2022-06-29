package com.kangethe.datastructures;

import com.kangethe.datastructures.List;
import com.kangethe.datastructures.EmptyListException;

public class QueueComposition<T> {

  private List<T> queueList;

  public QueueComposition() {

     queueList = new List<T>("queue");

  }

  public void enqueue(T object) {
  
    queueList.insertAtBack(object);  

  }  

  public T dequeue() throws EmptyListException {
  
    return queueList.removeFromFront();  
  }

  public boolean isEmpty() {
     
    return queueList.isEmpty();
  }

  public void print() {
 
    queueList.print();
  }

}