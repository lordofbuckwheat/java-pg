package com.lob.hotel.hotel.model;

import java.util.Objects;

public abstract class Model implements Cloneable {

  private int id;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return id == model.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public Model clone() throws CloneNotSupportedException {
    return (Model) super.clone();
  }
}
