package com.lob.hotel.hotel.model;

import java.util.function.Predicate;

public class FindByIdSpec<T extends Model> implements Predicate<T> {

  private final int id;

  public FindByIdSpec(int id) {
    this.id = id;
  }

  @Override
  public boolean test(T model) {
    return model.getId() == this.id;
  }

}
