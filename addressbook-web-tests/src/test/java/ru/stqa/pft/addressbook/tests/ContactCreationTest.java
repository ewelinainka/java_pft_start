package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Ewelinaaa11", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test 1"),true);
    app.getContactHelper().submitContactCreation(By.name("submit"));
    app.getContactHelper().returnToGroupPage();
    app.logout();
  }

}