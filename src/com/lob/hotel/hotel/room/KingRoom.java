package com.lob.hotel.hotel.room;

public class KingRoom extends AbstractRoom {

  public KingRoom(int price) {
    super(price);
  }

  @Override
  protected int getSize() {
    return 4;
  }

}
