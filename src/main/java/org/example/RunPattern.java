package org.example;


public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Adapter Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating ContactAdapter..");
        Contact contact = new ContactAdapter();
        System.out.println();
        System.out.println("ContactAdapter created - Setting Contact data..");
        contact.setFirstName("Thomas");
        contact.setLastName("Williamson");
        contact.setTitle("Chief Science Officer");
        contact.setOrganization("W3C");
        System.out.println();
        System.out.println("Contact data set - Printing Contact data using external package..");
        System.out.println(contact.toString());
        System.out.println("---- ---- ---- ---- ----");

    }
}