package edu.grinnell.csc207.util;

/**
 * Leaf node that stores value.
 * @author Jenifer Silva
 */
public class BitTreeLeaf implements BitTreeNode{

  String storedValue;

  public BitTreeLeaf(String value) {
    this.storedValue = value;
  }

  public String getValue() {
      return this.storedValue;
  }

  public void setValue(String value) {
    this.storedValue = value;
  }

  @Override
  public void setLeft (BitTreeNode left) {
    
  }

  @Override
  public void setRight(BitTreeNode right) {
    
  }

  @Override
  public BitTreeNode getLeft() {
    return null;
  }

  @Override
  public BitTreeNode getRight() {
    return null;
  }
}
