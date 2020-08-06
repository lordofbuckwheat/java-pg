package com.lob.hotel.hotel;

import com.lob.hotel.hotel.exceptions.InvalidArgumentException;
import com.lob.hotel.hotel.exceptions.NotFoundException;
import com.lob.hotel.hotel.model.FindByIdSpec;
import com.lob.hotel.hotel.model.guest.Guest;
import com.lob.hotel.hotel.model.guest.GuestIsAbsentException;
import com.lob.hotel.hotel.model.room.exseptions.RoomException;
import com.lob.hotel.hotel.repository.Repository;
import com.lob.hotel.hotel.model.room.Room;
import java.time.LocalDate;
import java.time.Period;

public class Hotel {

  private final Repository<Room> rooms = new Repository<>();
  private final Repository<Guest> guests = new Repository<>();

  // Поселить‌ ‌в‌ ‌номер
  public void checkIn(int roomId, String guestName, Period lengthOfStay)
      throws InvalidArgumentException, NotFoundException, RoomException, CloneNotSupportedException {
    if (guestName == null) {
      throw new InvalidArgumentException();
    }
    if (lengthOfStay == null || lengthOfStay.isNegative() || lengthOfStay.isZero()) {
      throw new InvalidArgumentException();
    }
    Guest guest = new Guest(guestName);
    Room room = this.rooms.findOne(new FindByIdSpec<>(roomId));
    LocalDate dayOfAdmission = LocalDate.now();
    guest.checkIn(room, dayOfAdmission, dayOfAdmission.plus(lengthOfStay));
    this.guests.add(guest);
    this.rooms.update(room);
  }

  // Выселить‌ ‌из‌ ‌номера
  public void checkOut(int guestId)
      throws NotFoundException, GuestIsAbsentException, RoomException, CloneNotSupportedException {
    Guest guest = this.guests.findOne(new FindByIdSpec<>(guestId));
    guest.checkOut();
    this.guests.update(guest);
  }

  // Изменить‌ ‌статус‌ ‌номера‌ ‌на‌ ‌ремонтируемый/обслуживаемый
  public void setRoomIsOutOfOrder(int roomId, boolean isOutOfOrder)
      throws NotFoundException, RoomException, CloneNotSupportedException {
    this.rooms.findOne(new FindByIdSpec<>(roomId)).setIsOutOfOrder(isOutOfOrder);
  }

  // Изменить‌ ‌цену‌ ‌номера
  public void setRoomRate(int roomId, int rate) throws NotFoundException {
    this.rooms.findOne(new FindByIdSpec<>(roomId)).setRate(rate);
  }

  // Добавить‌ ‌номер‌
  public Room createRoom(int capacity, int rating, int rate) throws InvalidArgumentException {
    if (capacity <= 0) {
      throw new InvalidArgumentException();
    }
    if (rating < 1 || rating > 5) {
      throw new InvalidArgumentException();
    }
    if (rate <= 0) {
      throw new InvalidArgumentException();
    }
    Room room = new Room(capacity, rating, rate);
    this.rooms.add(room);
    return room;
  }

  // Список‌ номеров‌ (сортировать‌ по‌ цене, вместимости, количеству‌ звезд)
  // Список‌ свободных‌ номеров‌ (сортировать‌ по‌ цене, вместимости, количеству‌ звезд)
  // Список‌ постояльцев‌ и‌ их‌ номеров‌ (сортировать‌ по‌ алфавиту, дате‌ освобождения‌ номера)
  // Общее‌ число‌ свободных‌ номеров‌
  // Общее‌ число‌ постояльцев‌
  // Список‌ номеров‌ которые‌ будут‌ свободны‌ по‌ определенной‌ дате‌ в‌ будущем‌
  // Сумму‌ оплаты‌ за‌ номер‌ которую‌ должен‌ оплатить‌ постоялец‌
  // Посмотреть‌ 3-х‌ последних‌ постояльцев‌ номера‌ и‌ даты‌ их‌ пребывания‌
  // Посмотреть‌ список‌ услуг‌ постояльца‌ и‌ их‌ цену‌ (сортировать‌ по‌ цене, по‌ дате)
  // Цены‌ услуг‌ и‌ номеров‌  (сортировать‌ по‌ разделу, цене)
  // Посмотреть‌ детали‌ отдельного‌ номера‌
  public Room getRoom(int roomId) throws NotFoundException {
    return this.rooms.findOne(new FindByIdSpec<>(roomId));
  }

  // Добавить ‌услугу
  // Изменить‌ ‌цену‌ ‌услуги

}
