package com.lob.unit1.ex4.rooms;

public class RoomIsUnavailableException extends Exception {
    @Override
    public String getMessage() {
        return "room is unavailable";
    }
}
