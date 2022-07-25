package com.kangethe.datastructures;

import com.kangethe.datastructures.MyLinkedList;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyLinkedListTest {

  private static Logger logger = Logger.getLogger(MyLinkedListTest.class.getName());

  public static void main(String[] args) {

    MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

    Iterator itr = myLinkedList.iterator();

    logger.info("adding numbers");
    myLinkedList.add(1);
    myLinkedList.add(156);
    myLinkedList.add(1345);
    myLinkedList.add(1234);
    myLinkedList.add(1252);
    myLinkedList.add(7125);

    

    while (itr.hasNext()) {
    
      System.out.print(itr.next()+" ");
    }

    for(int i = 0; i < myLinkedList.size(); i++) {

      System.out.println(myLinkedList.get(i));
    }

  }
}