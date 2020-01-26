package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModifyTest extends TestBase {

  @Test
  public void testGroupModify() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("Name_test_group", "test1", "test2"));
    }
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().clickEditGroup();
    GroupData group = new GroupData(before.get(before.size() - 1).getId(), "Name_test_group_modify", "test1", "test2");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().clickUpdate();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(group);

    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }

}
