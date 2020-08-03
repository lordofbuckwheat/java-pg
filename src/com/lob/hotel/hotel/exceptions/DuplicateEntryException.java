package com.lob.hotel.hotel.exceptions;

public class DuplicateEntryException extends Exception {

  @Override
  public String getMessage() {
    return "duplicate entry";
  }

}
