package com.kangethe.datastructures;

public class Node<T> {

    public T data;
    public Node<T> previous;
    public Node<T> next;
   
    
    public Node(T data, Node<T> previous, Node<T> next) {

      System.out.println("initializing Node");
      data = data;
      previous = previous;
      next = next;
    }

  }