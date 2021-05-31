package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupDataContact;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation(By locator) {
    click(locator);
  }

  public void fillContactForm(GroupDataContact groupDataContact) {
    type(By.name("firstname"), groupDataContact.getFirstname());
    type(By.name("lastname"), groupDataContact.getLastname());
    type(By.name("address"), groupDataContact.getAddress());
    type(By.name("email"), groupDataContact.getEmial1());
    type(By.name("email2"), groupDataContact.getEmial2());
    type(By.name("email3"), groupDataContact.getEmial3());
    type(By.name("home"), groupDataContact.getHomeno());
    type(By.name("mobile"), groupDataContact.getMobileno());
    type(By.name("work"), groupDataContact.getWorkno());
    type(By.name("fax"), groupDataContact.getFaxno());
  }

  public void addNewContact() {
    click(By.linkText("add new"));
  }
  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }
}
