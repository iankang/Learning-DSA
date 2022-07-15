package com.kangethe.datastructures;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue<T> {

  T[] a;
  int j;
  int n;

  public ArrayQueue() {

    a = (T[]) new Object[] {0};
    j = 0;
    n = 0;
  }

  public boolean add(T x) {

    if(n + 1 > a.length) {
      resize();
    }

    a[(j+n) % a.length] = x;
    n++;
    return true;

  }

  public T remove() {

    if (n == 0) {
      throw new NoSuchElementException();
    }
   
    T x = a[j];
    j = (j + 1) % a.length;
    n--;
    if (a.length >= 3*n) {

      resize();
    }
   
    return x;
  
  }

  public void resize() {
    T[] b = (T[]) new Object[] {(Math.max(1,n * 2))};
    for(int k = 0; k < n; k++) {

      b[k] = a[(j+k) % a.length];
    }
    
    a = b;
    j = 0;
  }

  public void print() {

    System.out.printf("j: %d %nn:%d %n",j,n);

    for (int i = 0 : a) {

      System.out.printf("%d ",a[i]);
    }

  }

}