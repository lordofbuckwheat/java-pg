package com.lob.hotel.hotel;

import com.lob.hotel.hotel.exceptions.InvalidArgumentException;
import com.lob.hotel.hotel.room.AbstractRoom;
import com.lob.hotel.hotel.service.AbstractService;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

  private final List<AbstractRoom> rooms = new ArrayList<>();
  private final List<AbstractService> services = new ArrayList<>();

  // Поселить‌ ‌в‌ ‌номер
  // Выселить‌ ‌из‌ ‌номера
  // Изменить‌ ‌статус‌ ‌номера‌ ‌на‌ ‌ремонтируемый/обслуживаемый
  // Изменить‌ ‌цену‌ ‌номера
  // Изменить‌ ‌цену‌ ‌услуги
  // Добавить‌ ‌номер‌
  public void createRoom(int capacity, int rating, int rate) throws InvalidArgumentException {
    if (capacity <= 0) {
      throw new InvalidArgumentException();
    }
    if (rating < 1 || rating > 5) {
      throw new InvalidArgumentException();
    }
    if (rate <= 0) {
      throw new InvalidArgumentException();
    }
    this.rooms.add(room);
  }
  // Добавить ‌услугу



  public void addService(AbstractService service) {
    this.services.add(service);
  }

}
