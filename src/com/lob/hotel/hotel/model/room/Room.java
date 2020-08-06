package com.lob.hotel.hotel.model.room;

import com.lob.hotel.hotel.model.Model;
import com.lob.hotel.hotel.model.guest.Guest;
import com.lob.hotel.hotel.model.guest.GuestIsAbsentException;
import com.lob.hotel.hotel.model.room.exseptions.GuestNotFoundException;
import com.lob.hotel.hotel.model.room.exseptions.RoomException;
import com.lob.hotel.hotel.model.room.exseptions.RoomIsOccupiedException;
import com.lob.hotel.hotel.model.room.exseptions.RoomIsUnavailableException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Room extends Model implements Cloneable {

  private final int capacity;
  private final int rating;
  private int rate;
  private final Set<Guest> guests = new HashSet<>();
  private boolean isOutOfOrder;
  private List<GuestRecord> guestRecords = new ArrayList<>();

  public Room(int capacity, int rating, int rate) {
    this.capacity = capacity;
    this.rating = rating;
    this.rate = rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public int getRate() {
    return this.rate;
  }

  public void acceptGuest(Guest guest) throws RoomException {
    if (this.isOutOfOrder) {
      throw new RoomIsUnavailableException();
    }
    if (!this.hasRoom()) {
      throw new RoomIsOccupiedException();
    }
    if (!this.guests.add(guest)) {
      throw new RoomIsOccupiedException();
    }
  }

  public void removeGuest(Guest guest) throws RoomException {
    if (!this.guests.contains(guest)) {
      throw new GuestNotFoundException();
    }
    GuestRecord guestRecord = new GuestRecord();
    guestRecord.guest = guest;
    guestRecord.dayOfAdmission = guest.getDayOfAdmission();
    guestRecord.dayOfDischarge = guest.getDayOfDischarge();
    this.guests.remove(guest);
    this.guestRecords.add(guestRecord);
  }

  public void setIsOutOfOrder(boolean isOutOfOrder) throws RoomException, GuestIsAbsentException {
    if (isOutOfOrder) {
      while (!this.guests.isEmpty()) {
        this.guests.iterator().next().checkOut();
      }
    }
    this.isOutOfOrder = isOutOfOrder;
  }

  public boolean getIsOutOfOrder() {
    return this.isOutOfOrder;
  }

  private boolean hasRoom() {
    return this.capacity - this.guests.length > 0;
  }

  private boolean hasGuests() {
    return this.guests. > 0;
  }

  private static class GuestRecord {

    public Guest guest;
    public LocalDate dayOfAdmission;
    public LocalDate dayOfDischarge;

  }

}
