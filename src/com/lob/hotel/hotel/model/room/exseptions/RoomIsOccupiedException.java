package com.lob.hotel.hotel.model.room.exseptions;

public class RoomIsOccupiedException extends RoomException {

  @Override
  public String getMessage() {
    return "room is occupied";
  }

}
