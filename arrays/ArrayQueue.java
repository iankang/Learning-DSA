package com.kangethe.datastructures;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue<T> {

  Factory<T> f;

  T[] a;
  int j;
  int n;

  public ArrayQueue(Class<T> t) {

    f = new Factory<T>(t);
    a = f.newArray();
    a = b;
    j = 0;
  }

  boolean add(T x) {

    if(n + 1 > a.length) {
      resize();
    }

    a[(j+n) % a.length] = x;
    n++;
    return true;

  }

  T remove() {

    if (n == 0) {
      throw new NoSuchElementException();
    }
   
    T x = a[j];
    j = (j + 1) % a.length;
    n--;
    if (a.length >= 3*n) {

      resize();
    }
  
  }

  void resize() {
    T[] b = newArray(max(1,n * 2));
    for(int k = 0; k < n; k++) {

      b[k] = a[(j+k) % a.length];
    }
    
    a = b;
    j = 0;
  }

}