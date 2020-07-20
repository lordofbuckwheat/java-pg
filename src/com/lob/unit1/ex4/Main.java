package com.lob.unit1.ex4;

import com.lob.unit1.ex4.rooms.Room;
import com.lob.unit1.ex4.rooms.RoomIsUnavailableException;
import com.lob.unit1.ex4.rooms.SingleRoom;
import com.lob.unit1.ex4.services.RoomService;
import com.lob.unit1.ex4.services.Service;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        try {
            Room room = new SingleRoom(123);
            hotel.addRoom(room);
            Service service = new RoomService(123);
            hotel.addService(service);
            room.checkIn();
            room.checkOut();
            room.setPrice(456);
            room.setOutOfOrder(true);
            service.setPrice(456);
        } catch (RoomIsUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

}
