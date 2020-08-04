package com.lob.hotel.hotel;

import com.lob.hotel.hotel.exceptions.NotFoundException;
import java.util.HashMap;
import java.util.Map;

public abstract class Repository<T extends Model> {

  protected final Map<Integer, T> storage = new HashMap<>();

  public void add(T object) {
    int lastId = this.storage.keySet().stream().mapToInt(Integer::valueOf).max().orElse(0);
    this.storage.put(++lastId, object);
    object.setId(lastId);
  }

  public void delete(T object) throws NotFoundException {
    if (!this.storage.containsKey(object.getId())) {
      throw new NotFoundException();
    }
    this.storage.remove(object.getId());
  }

  public abstract void update(T object);

}
