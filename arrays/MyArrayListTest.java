package com.kangethe.datastructures;

import com.kangethe.datastructures.MyArrayList;

public class MyArrayListTest {

  public static void main(String[] args) {

    MyArrayList<Integer> arrayList = new MyArrayList<Integer>();

    arrayList.add(1);
    arrayList.printStatus();

    arrayList.set(0,5);
    arrayList.printStatus();
  }

}