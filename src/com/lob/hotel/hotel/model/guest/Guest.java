package com.lob.hotel.hotel.model.guest;

import com.lob.hotel.hotel.model.Model;
import com.lob.hotel.hotel.model.room.Room;
import com.lob.hotel.hotel.model.room.exseptions.RoomException;
import java.time.LocalDate;

public class Guest extends Model {

  private final String name;
  private Room room;
  private LocalDate dayOfAdmission;
  private LocalDate dayOfDischarge;

  public Guest(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void checkIn(Room room, LocalDate dayOfAdmission, LocalDate dayOfDischarge)
      throws RoomException {
    this.room = room;
    this.dayOfAdmission = dayOfAdmission;
    this.dayOfDischarge = dayOfDischarge;
    room.acceptGuest(this);
  }

  public void checkOut() throws GuestIsAbsentException, RoomException {
    if (this.room == null) {
      throw new GuestIsAbsentException();
    }
    this.room.removeGuest(this);
    this.room = null;
  }

  public LocalDate getDayOfAdmission() {
    return this.dayOfAdmission;
  }

  public LocalDate getDayOfDischarge() {
    return this.dayOfDischarge;
  }
}
