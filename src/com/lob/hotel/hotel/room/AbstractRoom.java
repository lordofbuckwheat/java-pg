package com.lob.hotel.hotel.room;

import com.lob.hotel.hotel.room.exseptions.RoomException;
import com.lob.hotel.hotel.room.exseptions.RoomIsEmptyException;
import com.lob.hotel.hotel.room.exseptions.RoomIsOccupiedException;
import com.lob.hotel.hotel.room.exseptions.RoomIsUnavailableException;

public abstract class AbstractRoom {

  private int price;
  private int guests;
  private boolean outOfOrder;

  public AbstractRoom(int price) {
    this.price = price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void checkIn() throws RoomException {
    if (this.outOfOrder) {
      throw new RoomIsUnavailableException();
    }
    if (!this.hasRoom()) {
      throw new RoomIsOccupiedException();
    }
    this.guests++;
  }

  public void checkOut() throws RoomException {
    if (this.outOfOrder) {
      throw new RoomIsUnavailableException();
    }
    if (!this.hasGuests()) {
      throw new RoomIsEmptyException();
    }
    this.guests--;
  }

  public void setOutOfOrder(boolean outOfOrder) throws RoomException {
    if (outOfOrder) {
      while (this.hasGuests()) {
        this.checkOut();
      }
    }
    this.outOfOrder = outOfOrder;
  }

  protected abstract int getSize();

  private boolean hasRoom() {
    return this.getSize() - this.guests > 0;
  }

  private boolean hasGuests() {
    return this.guests > 0;
  }

}
