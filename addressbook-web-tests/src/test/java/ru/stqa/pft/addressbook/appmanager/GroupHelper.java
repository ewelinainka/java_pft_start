package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.GroupDataContact;

public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("groups"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.xpath("(//input[@name='new'])[2]"));
  }

 /* public void submitContactCreation(By locator) {
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
*/
  public void deleteSelectedGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
/*
  public void selectContact() {
    click(By.xpath("//input[@id='1']"));
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
  }*/
}
