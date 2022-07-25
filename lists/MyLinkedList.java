
package com.kangethe.datastructures;

import java.util.*;
import com.kangethe.datastructures.Node;

public class MyLinkedList<T> implements Iterable<T> {


  private int theSize;
  private int modCount = 0;
  private Node<T> beginMarker;
  private Node<T> endMarker;

  public MyLinkedList() {
    System.out.println("initializing MyLinkedList");
    doClear();
  }

  public void clear() {
  
    doClear();
  }

  public void doClear() {

    System.out.println("doClear");
    beginMarker = new Node<T>(null,null,null);
    endMarker = new Node<T>(null,beginMarker,null);
    beginMarker.next = endMarker;
  
    theSize = 0;
    modCount++;
  }

  public int size() {
  
    return theSize;
  }

  public boolean isEmpty() {

    return size() == 0;
  }
  
  public boolean add(T x) {
  
    add(size(), x);
    return true;
  }

  public void add(int idx, T x) {
 
    addBefore(getNode(idx,0,size()),x);
  }

  public T get(int idx) {

    return getNode(idx).data;
  }

  public T set(int idx, T newVal) {
  
    Node<T> p = getNode(idx);
    T oldVal = p.data;
    p.data = newVal;
    return oldVal;
  }

  private T remove(int idx) {

    return remove(getNode(idx));
  }

  private void addBefore(Node<T> p, T x) {

    Node<T> newNode; 
    if(p.previous != null) {
      newNode = new Node<T>(x, p.previous,p);
    } else {
      newNode = new Node<T>(x, null, p)
    }

    if (beginMarker == null) {

      beginMarker = newNode;
      endMarker = newNode;
    } else {

      endMarker.next = newNode;
      
    }
   
    if(newNode.previous != null){
      newNode.previous.next = newNode;
    }
    p.previous = newNode;
    theSize++;
    modCount++;
  }

  private T remove(Node<T> p) {
    
    p.next.previous = p.previous;
    p.previous.next = p.next;
    theSize--;
    modCount++;

    return p.data;
  }

  private Node<T> getNode(int idx) {

    return getNode(idx, 0, size() -1);
  }

  private Node<T> getNode(int idx, int lower, int upper) {
    
    Node<T> p;

    if ( idx < lower || idx > upper ) {

      throw new IndexOutOfBoundsException();
    }

    if (idx < size() / 2) {
  
      p = beginMarker.next;
      for (int i = 0; i < idx; i++) {

        p = p.next;
      }
    } else {

      p = endMarker;
      for (int i = size(); i > idx; i-- ) {

        p = p.previous;
      }
    }
    return p;
  }

  public Iterator<T> iterator(){
  
    return new LinkedListIterator();
  }
  private class LinkedListIterator implements Iterator<T> {

    private Node<T> current = beginMarker.next;
    private int expectedModCount = modCount;
    private boolean okToRemove = false;

    public boolean hasNext() {

      return current != endMarker;
    }

    public T next() {

       if (modCount != expectedModCount) {
 
        throw new ConcurrentModificationException();
      }
      
       if (!hasNext()) {

        throw new NoSuchElementException();
      }

      T nextItem = current.data;
      current = current.next;
      okToRemove = true;
      return nextItem;
    }

    public void remove() {

      if (modCount != expectedModCount) {

        throw new ConcurrentModificationException();
      }

      if ( !okToRemove ) {
        
        throw new IllegalStateException();
      }
 
      MyLinkedList.this.remove(current.previous);
      expectedModCount++;
      okToRemove = false;
    }
  }



}