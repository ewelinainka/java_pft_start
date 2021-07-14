package ru.stqa.pft.addressbook.tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupsHelper().getGroupCount();
    app.getGroupsHelper().createGroup(new GroupData("test q", null, null));
    int after = app.getGroupsHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
    // app.logout();
  }

}