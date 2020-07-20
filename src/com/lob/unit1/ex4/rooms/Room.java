package com.lob.unit1.ex4.rooms;

public abstract class Room {
    private int price;
    private boolean occupied;
    private boolean outOfOrder;

    public Room(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void checkIn() throws RoomIsUnavailableException {
        if (this.occupied || this.outOfOrder) {
            throw new RoomIsUnavailableException();
        }
        this.occupied = true;
    }

    public void checkOut() throws RoomIsUnavailableException {
        if (this.outOfOrder) {
            throw new RoomIsUnavailableException();
        }
        this.occupied = false;
    }

    public void setOutOfOrder(boolean outOfOrder) throws RoomIsUnavailableException {
        if (outOfOrder && this.occupied) {
            this.checkOut();
        }
        this.outOfOrder = outOfOrder;
    }

}
