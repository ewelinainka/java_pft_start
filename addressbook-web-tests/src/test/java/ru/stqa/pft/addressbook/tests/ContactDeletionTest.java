package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion() {

    app.getNavigationHelper().gotoHomePage();

    if(!app.getContactHelper().isThereAGroup()){
      app.getContactHelper().createContact(new ContactData("Ewelinaaa11", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test 1"),true);
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();

  }
}


















