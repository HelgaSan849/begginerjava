package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTest extends TestBase {

    @Test
    public void testContactModify() throws Exception {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().clickContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Henry", "Smith", "title", "Company", "London"));
        app.getContactHelper().updateContact();

    }
}
