//package ru.stqa.pft.addressbook.tests;
/*
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();


    if(!app.getContactHelper().isThereAGroup()){
      app.getContactHelper().createContact(new ContactData("Ewelinaaa11", "Inka", null, null, null, null, "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q"),true);
    }

    int after = app.getContactHelper().getContactCount();
    app.getContactHelper().editContact(1);
    app.getContactHelper().fillContactForm(new ContactData("Ewelinaaa1zz1", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q"),false);

    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();

    int before = app.getContactHelper().getContactCount();
    Assert.assertEquals(before, after);

  }
}

 */
package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {

  @Test(enabled = false)

  public void testContactModification() {

    app.goTo().gotoHomePage();

    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Ewelinaaa1zz1", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q"),true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().initContractModification(before.size() - 1);
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "Ewelinaaa1zz1", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444","test q");
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.goTo().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> ById = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(ById);
    after.sort(ById);
    //Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
    Assert.assertEquals(before, after);
  }
}