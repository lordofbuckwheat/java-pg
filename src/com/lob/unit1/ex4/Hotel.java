package com.lob.unit1.ex4;

import com.lob.unit1.ex4.rooms.Room;
import com.lob.unit1.ex4.services.Service;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Room> rooms = new ArrayList<>();
    private final List<Service> services = new ArrayList<>();

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void addService(Service service) {
        this.services.add(service);
    }

}
