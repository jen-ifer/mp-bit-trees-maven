package edu.grinnell.csc207.util;

/**
 *Interface for how the nodes are made.
 * @author Jenifer Silva
 */
public interface BitTreeNode {

  void setLeft (BitTreeNode left);

  void setRight(BitTreeNode right);

  String getValue();

  BitTreeNode getLeft();

  BitTreeNode getRight();
  
}
