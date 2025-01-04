package edu.grinnell.csc207.util;
/**
 * Node the contains the right and left children.
 *
 * @author Jenifer Silva
 */
public class BitTreeInteriorNode implements BitTreeNode {

  public BitTreeInteriorNode() {
    nodeLeft = null;
    nodeRight = null;
  }

  BitTreeNode nodeLeft;
  BitTreeNode nodeRight;

  public void setLeft (BitTreeNode left) {
    this.nodeLeft = left;
  }

  public void setRight(BitTreeNode right) {
    this.nodeRight = right;
  }

  public String getValue() {
    return null;
  }

  public BitTreeNode getLeft() {
    return this.nodeLeft;
  }

  public BitTreeNode getRight() {
    return this.nodeRight;
  }
  
}
