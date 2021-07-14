package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;

public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().selectGroup();
    app.getGroupsHelper().deleteSelectedGroup();
    app.getGroupsHelper().returnToGroupPage();
  }


}

