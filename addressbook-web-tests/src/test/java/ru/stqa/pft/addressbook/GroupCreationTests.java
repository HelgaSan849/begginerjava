package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {
    @Test
  public void testGroupCreation() throws Exception {

    gotoGroupPage();
    initGroupCreation("new");
    fillGroupForm(new GroupData("Name_test_group", "test1", "test2"));
    submitGroupCreation();
    logout();
  }

}
