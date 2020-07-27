package com.lob.unit1.ex2.stock;

public class OutOfSpaceException extends Exception {

  @Override
  public String getMessage() {
    return "stock is out of space";
  }
  
}
