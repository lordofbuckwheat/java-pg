package com.lob.hotel.hotel.room;

public class SingleRoom extends AbstractRoom {

  public SingleRoom(int price) {
    super(price);
  }

  @Override
  protected int getSize() {
    return 1;
  }

}
