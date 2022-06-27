
package com.kangethe.datastructures;

public class ListNode<T> {

  T data;
  ListNode<T> nextNode;

  ListNode(T object) {

    this(object, null);

  }

  ListNode(T object, ListNode<T> node) {
    
    data = object;
    nextNode = node;

  } 

  T getData() {

    return data;
  }

  ListNode<T> getNext() {

    return nextNode;
  }



}