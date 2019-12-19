package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class ContactDeletionTest extends TestBase {


  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().clickContact();
    app.getContactHelper().deleteContact();
  }

}
