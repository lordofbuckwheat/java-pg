package com.lob.hotel.hotel.repository;

import com.lob.hotel.hotel.model.Model;
import com.lob.hotel.hotel.exceptions.NotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Repository<T extends Model> {

  private final Map<Integer, T> storage = new HashMap<>();

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

  public void update(T object) throws NotFoundException {
    if (!this.storage.containsKey(object.getId())) {
      throw new NotFoundException();
    }
    this.storage.replace(object.getId(), object);
  }

  public T findOne(Predicate<T> spec) throws NotFoundException {
    return this.storage.values().stream().filter(spec).findFirst().orElseThrow(NotFoundException::new);
  }

}
