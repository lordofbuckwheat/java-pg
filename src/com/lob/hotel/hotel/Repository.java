package com.lob.hotel.hotel;

import com.lob.hotel.hotel.exceptions.DuplicateEntryException;
import com.lob.hotel.hotel.exceptions.NotFoundException;
import java.util.HashSet;
import java.util.Set;

public abstract class Repository<T> {

  protected final Set<T> set = new HashSet<>();

  public void add(T object) throws DuplicateEntryException {
    if (!this.set.add(object)) {
      throw new DuplicateEntryException();
    }
  }

  public void delete(T object) throws NotFoundException {
    if (!this.set.remove(object)) {
      throw new NotFoundException();
    }
  }

  public abstract void update(T object);

  public abstract T[] list();

}
