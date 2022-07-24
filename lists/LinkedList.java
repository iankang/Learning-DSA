
package com.kangethe.datastructures;

import com.kangethe.datastructures.SLNode;

public class LinkedList<T> {

  SLNode<T> head;
  SLNode<T> tail;
  int n;

  T push(T x) {

    SLNode u = new SLNode();
    u.x = x;
    u.next = head;
    head = u;
    if (n == 0) {
      tail = u;
    }
    n++;
    return x;
  }

  T pop() {

    if(n == 0) {

      return null;
    }

    T x = head.x;
    head = head.next;
    if(--n == 0) {
      tail = null;
    }
    return x;
  }

  T remove() {
    if (n == 0) {
      return null;
    }
    T x = head.x;
    head = head.next;
    
    if (--n == 0) {

      tail = null;
    }

    return x;
  }

  boolean add(T x) {

    SLNode u = new SLNode();
    u.x = x;
    if (n == 0) {
      head = u;
    } else {
      tail.next = u;
    }

    tail = u;
    n++;
    return true;
  }

}