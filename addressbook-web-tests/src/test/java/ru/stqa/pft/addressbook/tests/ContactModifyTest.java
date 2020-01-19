package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTest extends TestBase {

    @Test
    public void testContactModify() throws Exception {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Ann", "Smith", "title", "Company", "London", "test1"));
        }
        app.getNavigationHelper().gotoHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().clickContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Henry", null, "title", "Company", "London", null), false);
        app.getContactHelper().updateContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
