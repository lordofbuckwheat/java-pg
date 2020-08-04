package com.lob.hotel.hotel.model.room.exseptions;

public class RoomIsEmptyException extends RoomException {

  @Override
  public String getMessage() {
    return "room is empty";
  }

}
