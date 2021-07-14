package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
  private final String id;
  private final String name;
  private final String header;
  private final String footer;

  public GroupData(String name, String header, String footer) {
    this.name = name;
    this.header = header;
    this.footer = footer;
    this.id = null;
  }

  public String getId() {//wygenerewane code>Getter po stworzeniu nowej zmiennej id i konstruktora
    return id;
  }

  public String getName() {

    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }

  @Override //wygenerewane code> equals
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return Objects.equals(id, groupData.id) && Objects.equals(name, groupData.name);
  }

  @Override //wygenerewane code> equals
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override //wygenerewane code> toString
  public String toString() {
    return "GroupData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
