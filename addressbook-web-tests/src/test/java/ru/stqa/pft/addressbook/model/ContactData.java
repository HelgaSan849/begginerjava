package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String lastname;
    private final String title;
    private final String company;
    private final String address;
    private String group;

    public ContactData(String name, String lastname, String title, String company, String address, String group) {
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}
