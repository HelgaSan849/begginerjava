package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModifyTest extends TestBase {

  @Test
  public void testGroupModify() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().clickEditGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("Name_test_group_modify", "test1", "test2"));
    app.getGroupHelper().clickUpdate();
  }

}
