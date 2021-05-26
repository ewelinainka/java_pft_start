package ru.stqa.pft.addressbook.test;



import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("ru.stqa.pft.addressbook.test 1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.logout();
  }

}