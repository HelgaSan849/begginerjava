package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

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
    app.getGroupHelper().fillGroupForm(new GroupData("Name_test_group_modify", "test1", "test2"));
    app.getGroupHelper().clickUpdate();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }

}
