package com.lob.hotel.hotel.guest;

import java.util.Objects;

public class Guest {

  private final String name;

  public Guest(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guest guest = (Guest) o;
    return guest.name.equals(name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
