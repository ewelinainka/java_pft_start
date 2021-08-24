package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.*;

public class GroupModificationTests extends TestBase{

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().groupPage();

    if(app.group().list().size() ==0){
      app.group().create(new GroupData( "test q", null, null));
    }
  }
  @Test
 public void testModification(){

    List<GroupData> before = app.group().list();
    int index= before.size() - 1;
    GroupData group = new GroupData(before.get(index).getId(),"test 1a", "test2b", "test3c");
    app.group().modify(index, group);
    List<GroupData> after = app.group().list();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index);
    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2)-> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
  // Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
     Assert.assertEquals (before, after);




  }


}
