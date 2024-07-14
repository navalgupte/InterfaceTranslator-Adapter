package org.example;

public class ContactAdapter implements Contact {
    private Chovnatlh contact;

    public ContactAdapter() {
        contact = new ChovnatlhImpl();
    }

    public ContactAdapter(Chovnatlh contact) {
        this.contact = contact;
    }

    public String getFirstName() {
        return contact.tlhapWa$DIchPong();
    }

    public String getLastName() {
        return contact.tlhapQavPong();
    }

    public String getTitle() {
        return contact.tlhapPatlh();
    }

    public String getOrganization() {
        return contact.tlhapGhom();
    }

    public void setContact(Chovnatlh contact) {
        this.contact = contact;
    }
    public void setFirstName(String firstName) {
        contact.cherWa$DIchPong(firstName);
    }

    public void setLastName(String lastName) {
        contact.cherQavPong(lastName);
    }

    public void setTitle(String title) {
        contact.cherPatlh(title);
    }

    public void setOrganization(String organization) {
        contact.cherGhom(organization);
    }

    @Override
    public String toString() {
        return contact.toString();
    }
}
