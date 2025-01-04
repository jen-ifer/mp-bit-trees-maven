package edu.grinnell.csc207.util;

import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Trees intended to be used in storing mappings between fixed-length sequences of bits and
 * corresponding values.
 *
 * @author Jenifer Silva
 */
public class BitTree {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  BitTreeNode root;

  int size;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Making a new tree.
   */
  public BitTree(int n) {
    this.root = null;
    this.size = n;
  } // BitTree(int)

  // +---------------+-----------------------------------------------
  // | Local helpers |
  // +---------------+

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   *
   */
  public void set(String bits, String value) {
    if (bits.length() != this.size) {
      throw new IndexOutOfBoundsException();
    }
    if (root == null) {
      root = new BitTreeInteriorNode();
    }

    BitTreeNode current = root;
    for (int i = 0; i < bits.length(); i++) {
      char zeroOrOne = bits.charAt(i);

      if (zeroOrOne == '0') {
        current.setLeft(new BitTreeInteriorNode());
      } else if (zeroOrOne == '1') {
        current.setRight(new BitTreeInteriorNode());
      } else {
        throw new IndexOutOfBoundsException();
      }

    }

    if (current instanceof BitTreeLeaf) {
      ((BitTreeLeaf) current).setValue(value);
    }
  } // set(String, String)

  /**
   *
   */
  public String get(String bits) {
    if(bits.length() != this.size) {
      throw new IndexOutOfBoundsException();
    }
    if (root == null) {
      root = new BitTreeInteriorNode();
    }

    BitTreeNode current = root;
    for(int i = 0; i < bits.length(); i++) {
      char zeroOrOne = bits.charAt(i);

      if(zeroOrOne == '0') {
        current.getLeft();
      } else if (zeroOrOne == '1') {
        current.getRight();
      } else {
        throw new IndexOutOfBoundsException();
      }
    
    }

    if(current instanceof BitTreeLeaf) {
    return ((BitTreeLeaf) current).getValue();
   }

  } // get(String, String)

  /**
   *
   */
  public void dump(PrintWriter pen) {
    // STUB
  } // dump(PrintWriter)

  /**
   *
   */
  public void load(InputStream source) {
    
  } // load(InputStream)

} // class BitTree
