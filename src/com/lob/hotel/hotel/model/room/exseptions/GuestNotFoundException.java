package com.lob.hotel.hotel.model.room.exseptions;

public class GuestNotFoundException extends RoomException {

  @Override
  public String getMessage() {
    return "room is empty";
  }

}
