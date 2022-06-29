
package com.kangethe.datastructures;

import java.lang.Comparable;
import com.kangethe.datastructures.TreeNode;

public class Tree<T extends Comparable<T>> {

  private TreeNode<T> root;

  public Tree() {

    root = null;
  }

  public void insertNode(T insertValue) {

    if (root == null) {

      root = new TreeNode<T>(insertValue);
    } else {

      root.insert(insertValue);
    }

  }

  public void preorderTraversal() {
  
    preOrderHelper(root);
  }

  private void preOrderHelper(TreeNode<T> node) {

    if(node == null) {

      return;
    }

    System.out.printf("%s ", node.data);
    preOrderHelper(node.leftNode);
    preOrderHelper(node.rightNode);
  
  }

  public void inorderTraversal() {
    
    inorderHelper(root);
  }

  private void inorderHelper(TreeNode<T> node) {

    if(node == null) {
      return;
    }  

    inorderHelper(node.leftNode);
    System.out.printf("%s ", node.data);
    inorderHelper(node.rightNode);
  }

  public void postOrderTraversal() {
    postOrderHelper(root);
  }

  private void postOrderHelper(TreeNode<T> node) {

    if(node == null) {
      return;
    }

    postOrderHelper(node.leftNode);
    postOrderHelper(node.rightNode);
    System.out.printf("%s ", node.data);
  }

}