package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest  extends TestBase{


  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().createContact(new ContactData("Ann", "Smith", "title", "Company", "London", "test1"));
    app.getNavigationHelper().gotoHomePage();
  }

}
