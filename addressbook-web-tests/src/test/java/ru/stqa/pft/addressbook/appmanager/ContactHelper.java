package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.ArrayList;
import java.util.List;

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
  public void selectContact(int index)
  {
    wd.findElements(By.name("selected[]")).get(index).click();

   // click(By.name("selected[]"));
  }

  public void editContact(int index1)
  {
    wd.findElements(By.xpath("//img[@alt='Edit']")).get(index1).click();
    //click(By.xpath("//img[@alt='Edit']"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }
  public void returnToContactPage() {
    click(By.linkText("home"));
  }

  public void createContact(ContactData contact, boolean b) {
    addNewContact();
    fillContactForm(contact,true);
    submitContactCreation(By.name("submit"));
    returnToContactPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
  List<WebElement> rows = wd.findElements(By.name("entry"));
  for(WebElement element : rows){
    List<WebElement> cells = element.findElements(By.tagName("td"));
    String firstname = cells.get(1).getText();
    String lastname = cells.get(2).getText();
    int id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(id, lastname, firstname,null, null, null, null, null, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }

  public void createContact(ContactData contact) {
    addNewContact();
    fillContactForm(contact,true);
    submitContactCreation(By.name("submit"));
    returnToContactPage();
  }

  public void initContractModification(int index) {

    click(By.xpath("//table[@id='maintable']/tbody/tr[" + index + "]/td[8]/a/img"));

  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
