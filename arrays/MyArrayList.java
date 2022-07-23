package com.kangethe.datastructures;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

  private static final int DEFAULT_CAPACITY = 10;

  private int theSize;
  private T[] items;

  public MyArrayList() {

    doClear();
  }

  public void clear() {

    doClear();
  }

  private void doClear() {

    theSize = 0;
    items = (T[]) new Object[DEFAULT_CAPACITY];
    ensureCapacity(DEFAULT_CAPACITY);
  }

  public int size() {

    return theSize;
  }

  public boolean isEmpty() {

    return size() == 0;
  }

  public void trimToSize() {

    ensureCapacity(size());
  }

  public T get(int i) {

    if (i < 0 || i >= size()) {
      throw new ArrayIndexOutOfBoundsException();
    }

    return items[i];
  }

  public T set(int i, T newValue) {

    if (i < 0 || i >= size()) {

      throw new ArrayIndexOutOfBoundsException();
    }
    T old = items[i];
    items[i] = newValue;
    return old;
  }

  public void ensureCapacity(int newCapacity) {

    if (newCapacity < theSize) {

      return;
    }

    T[] old = items;
    items = (T[]) new Object[newCapacity];

    for (int i = 0; i < old.length; i++) {

      items[i] = old[i];
    }
  }

  public boolean add(T x) {

    add(size(), x);
    return true;
  }

  public void add(int i, T x) {

    if (items.length == size()) {

      ensureCapacity(size() * 2 + 1);
    }
    
    
    for (int j = size(); j > i; j--) {

      items[j] = items[j - 1];
    }

    items[i] = x;
    theSize++;
  }

  public T remove( int i) {

    T removedItem = items[i];

    for(int j = i; j <  size() - 1; j++) {
    
      items[j] = items[j + 1];
    }

    theSize--;
    return removedItem;
  }

  public Iterator<T> iterator() {

    return new ArrayListIterator();
  }

  public T[] getItems() {
  
    return items;
  }

  public void printStatus(){

    System.out.printf("size: %d \n",theSize);

    for (int i = 0; i < items.length; i++) {
     
      System.out.print(items[i] + " ");
    }

    System.out.println();
  }

  private class ArrayListIterator implements Iterator<T> {

    private int current = 0;

    public boolean hasNext() {

      return current < size();
    }

    public T next() {

      return items[current++];
    }

    public void remove() {

      MyArrayList.this.remove( --current);    
    }
  }
}
