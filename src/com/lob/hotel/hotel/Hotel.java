package com.lob.hotel.hotel;

import com.lob.hotel.hotel.room.AbstractRoom;
import com.lob.hotel.hotel.service.AbstractService;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

  private final List<AbstractRoom> rooms = new ArrayList<>();
  private final List<AbstractService> services = new ArrayList<>();

  public void addRoom(AbstractRoom room) {
    this.rooms.add(room);
  }

  public void addService(AbstractService service) {
    this.services.add(service);
  }

}
