package com.lob.hotel.hotel.room;

public class DoubleRoom extends AbstractRoom {

  public DoubleRoom(int price) {
    super(price);
  }

  @Override
  protected int getSize() {
    return 2;
  }

}
