package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.test.TestBase;

public class ContactCreationTest extends TestBase {


  @Test
  public void testContactCreation() throws Exception {

    Login("admin", "secret");
    addNewContact();
    fillContactForm(new GroupDataContact("Ewelina", "Inka", "Test address 11", "a@gmail.com", "b@gmail.com", "c@gmail.com", "123-345-567", "222-222-222", "333-333-333", "444-444-444"));
    submitContactCreation();
  }

}
