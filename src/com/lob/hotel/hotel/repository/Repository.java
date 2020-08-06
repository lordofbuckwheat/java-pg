package com.lob.hotel.hotel.repository;

import com.lob.hotel.hotel.model.Model;
import com.lob.hotel.hotel.exceptions.NotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Repository<T extends Model> {

  private final Map<Integer, T> storage = new HashMap<>();

  public void add(T object) throws CloneNotSupportedException {
    int lastId = this.storage.keySet().stream().mapToInt(Integer::valueOf).max().orElse(0);
    lastId++;
    object.setId(lastId);
    this.storage.put(lastId, (T) object.clone());
  }

  public void delete(T object) throws NotFoundException {
    if (!this.storage.containsKey(object.getId())) {
      throw new NotFoundException();
    }
    this.storage.remove(object.getId());
  }

  public void update(T object) throws NotFoundException, CloneNotSupportedException {
    if (!this.storage.containsKey(object.getId())) {
      throw new NotFoundException();
    }
    this.storage.replace(object.getId(), (T) object.clone());
  }

  public T findOne(Predicate<T> spec) throws NotFoundException, CloneNotSupportedException {
    return (T) this.storage.values().stream().filter(spec).findFirst()
        .orElseThrow(NotFoundException::new).clone();
  }

}
