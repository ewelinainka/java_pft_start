package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();

     if(!app.getGroupsHelper().isThereAGroup()){
      app.getGroupsHelper().createGroup(new GroupData("test q", null, null));

    }
    int before = app.getGroupsHelper().getGroupCount();
    app.getGroupsHelper().selectGroup(before - 1);
    app.getGroupsHelper().deleteSelectedGroup();
    app.getGroupsHelper().returnToGroupPage();

    int after = app.getGroupsHelper().getGroupCount();
    Assert.assertEquals(after, before -1);
  }


}

