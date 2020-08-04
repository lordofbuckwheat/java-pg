package com.lob.hotel.hotel.model.room;

import com.lob.hotel.hotel.model.Model;
import com.lob.hotel.hotel.model.guest.Guest;
import com.lob.hotel.hotel.model.room.exseptions.RoomException;
import com.lob.hotel.hotel.model.room.exseptions.RoomIsEmptyException;
import com.lob.hotel.hotel.model.room.exseptions.RoomIsOccupiedException;
import com.lob.hotel.hotel.model.room.exseptions.RoomIsUnavailableException;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Room extends Model {

  private final int capacity;
  private final int rating;
  private int rate;
  private final Set<Guest> guests = new HashSet<>();
  private boolean isOutOfOrder;

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

  public void checkIn(Guest guest, Period lengthOfStay) throws RoomException {
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

  public void checkOut() throws RoomException {
    if (this.isOutOfOrder) {
      throw new RoomIsUnavailableException();
    }
    if (!this.hasGuests()) {
      throw new RoomIsEmptyException();
    }
    this.guests--;
  }

  public void setIsOutOfOrder(boolean outOfOrder) throws RoomException {
    if (outOfOrder) {
      while (this.hasGuests()) {
        this.checkOut();
      }
    }
    this.isOutOfOrder = outOfOrder;
  }

  public boolean getIsOutOfOrder() {
    return this.isOutOfOrder;
  }

  private boolean hasRoom() {
    return this.capacity - this.guests.length > 0;
  }

  private boolean hasGuests() {
    return this.guests.length > 0;
  }

}