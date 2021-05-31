package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation(By locator) {
    click(locator);
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("email"), contactData.getEmial1());
    type(By.name("email2"), contactData.getEmial2());
    type(By.name("email3"), contactData.getEmial3());
    type(By.name("home"), contactData.getHomeno());
    type(By.name("mobile"), contactData.getMobileno());
    type(By.name("work"), contactData.getWorkno());
    type(By.name("fax"), contactData.getFaxno());

    if(creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());}
    else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
           }
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
  public void returnToGroupPage() {
    click(By.linkText("groups"));
  }

 // public void submitContactModification() {
 //   click(By.name("submit"));
 // }
}
