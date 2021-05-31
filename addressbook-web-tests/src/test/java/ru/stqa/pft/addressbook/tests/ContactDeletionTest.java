package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ContactDeletionTest extends TestBase{
  WebDriver wd;

  @Test
          public void testContactDeletion() {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    wd.switchTo().alert().accept();



  }



}


















