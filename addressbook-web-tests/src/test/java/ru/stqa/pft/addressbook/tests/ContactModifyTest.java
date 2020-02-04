package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class ContactModifyTest extends TestBase {

    @Test
    public void testContactModify() throws Exception {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Ann", "Smith", "title", "Company", "London", "test1"));
        }
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().clickContact(before.size() - 1);
        app.getContactHelper().editContact();
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "Henry", null, "title", "Company", "London", null);
        app.getContactHelper().fillContactForm(new ContactData("Henry", null, "title", "Company", "London", null), false);
        app.getContactHelper().updateContact();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);

        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    }
}
