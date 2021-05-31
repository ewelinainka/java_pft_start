package ru.stqa.pft.addressbook.tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().createGroup(new GroupData("test q", null, null));
   /* app.getGroupsHelper().initGroupCreation();
    app.getGroupsHelper().fillGroupForm(new GroupData("test q", null, null));
    app.getGroupsHelper().submitGroupCreation();
    app.getGroupsHelper().returnToGroupPage(); */
    app.logout();
  }

}