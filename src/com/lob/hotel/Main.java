package com.lob.hotel;

import com.lob.hotel.hotel.Hotel;
import com.lob.hotel.hotel.room.AbstractRoom;
import com.lob.hotel.hotel.room.KingRoom;
import com.lob.hotel.hotel.room.SingleRoom;
import com.lob.hotel.hotel.room.exseptions.RoomException;
import com.lob.hotel.hotel.room.exseptions.RoomIsOccupiedException;
import com.lob.hotel.hotel.service.RoomService;
import com.lob.hotel.hotel.service.AbstractService;

public class Main {

  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    AbstractRoom room = new KingRoom(123);
    hotel.addRoom(room);
    AbstractService service = new RoomService(123);
    hotel.addService(service);
    try {
      room.checkIn();
      room.checkIn();
      room.checkIn();
      room.checkOut();
      room.setPrice(456);
      room.setOutOfOrder(true);
      service.setPrice(456);
    } catch (RoomException ex) {
      System.out.println(ex.getMessage());
    }
  }

}
