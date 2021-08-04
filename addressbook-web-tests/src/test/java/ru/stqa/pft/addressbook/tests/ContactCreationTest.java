package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().gotoHomePage();
  //  List<GroupData> before = app.getContactHelper().getContactList();
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("Ewelinaaa11", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q"),true);
  //  List<GroupData> after = app.getContactHelper().getContactList();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);
  }

}