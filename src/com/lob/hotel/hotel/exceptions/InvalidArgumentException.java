package com.lob.hotel.hotel.exceptions;

public class InvalidArgumentException extends Exception {

  @Override
  public String getMessage() {
    return "invalid argument";
  }

}
