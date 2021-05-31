package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address;
  private final String emial1;
  private final String emial2;
  private final String emial3;
  private final String homeno;
  private final String mobileno;
  private final String workno;
  private final String faxno;
  private String group;

  public ContactData(String firstname, String lastname, String address, String emial1, String emial2, String emial3, String homeno, String mobileno, String workno, String faxno, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.emial1 = emial1;
    this.emial2 = emial2;
    this.emial3 = emial3;
    this.homeno = homeno;
    this.mobileno = mobileno;
    this.workno = workno;
    this.faxno = faxno;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getEmial1() {
    return emial1;
  }

  public String getEmial2() {
    return emial2;
  }

  public String getEmial3() {
    return emial3;
  }

  public String getHomeno() {
    return homeno;
  }

  public String getMobileno() {
    return mobileno;
  }

  public String getWorkno() {
    return workno;
  }

  public String getFaxno() {
    return faxno;
  }
  public String getGroup(){
    return group;
  }
}
