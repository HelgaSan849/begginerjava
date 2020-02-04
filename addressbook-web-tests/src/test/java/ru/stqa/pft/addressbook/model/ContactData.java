package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    private final String id;
    private final String name;
    private final String lastname;
    private final String title;
    private final String company;
    private final String address;
    private String group;

    public ContactData(String name, String lastname, String title, String company, String address, String group) {
        this.id = null;
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.group = group;
    }

    public ContactData(String id, String name, String lastname, String title, String company, String address, String group) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.group = group;
    }

    public String getId() {
        return id;
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

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname);
    }
}
