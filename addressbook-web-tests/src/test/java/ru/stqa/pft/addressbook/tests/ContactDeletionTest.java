package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {


  @Test
  public void testContactDeletion() throws Exception {

    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Ann", "Smith", "title", "Company", "London", "test1"));
    }
    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().clickContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().closeAlert();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }

}
