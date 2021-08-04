package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion() {

    app.getNavigationHelper().gotoHomePage();

       if(!app.getContactHelper().isThereAGroup()){
      app.getContactHelper().createContact(new ContactData("Ewelinaaa11", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q"),true);
    }

    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(1);
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().returnToContactPage();

    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(before.size() - 1);

    Assert.assertEquals(before, after);

  }
}


















