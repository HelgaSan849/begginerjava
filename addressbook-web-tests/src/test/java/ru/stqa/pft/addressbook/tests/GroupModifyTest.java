package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModifyTest extends TestBase {
  private WebDriver wd;

  @Test
  public void testGroupModify() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    clickEditGroup();
    app.getGroupHelper().fillGroupForm(new GroupData("Name_test_group_modify", "test1", "test2"));
    clickUpdate();
    app.getNavigationHelper().gotoGroupPage();
  }

  public void clickUpdate() {
    wd.findElement(By.name("update")).click();
  }

  public void clickEditGroup() {
    wd.findElement(By.xpath("(//input[@name='edit'])[2]")).click();
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Groups'])[1]/following::form[1]")).click();
  }
}
