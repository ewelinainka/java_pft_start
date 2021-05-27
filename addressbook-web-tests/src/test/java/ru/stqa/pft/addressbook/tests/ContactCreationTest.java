package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDataContact;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() {

    app.getNavigationHelper().gotoHomePage();
    app.getGroupsHelper().addNewContact();
    app.getGroupsHelper().fillContactForm(new GroupDataContact("Ewelinaaa", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444"));
    app.getGroupsHelper().submitContactCreation(By.name("submit"));
    app.logout();
  }

}