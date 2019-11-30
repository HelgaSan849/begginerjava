package ru.stqa.pft.addressbook;

public class ContactData {
    private final String name;
    private final String lastname;
    private final String title;
    private final String company;
    private final String address;

    public ContactData(String name, String lastname, String title, String company, String address) {
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.company = company;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}
