package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();

    if(!app.getContactHelper().isThereAGroup()){
      app.getContactHelper().createContact(new ContactData("Ewelinaaa11", "Inka", null, null, null, null, "123-345-567", "222-222-222", "333-333-333", "444-444-444","test 1"),true);
    }

    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Ewelinaaa1zz1", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test 1"),false);

    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();

  }

  }
