package MobilePhone.exercise;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) > -1) {
            return false;
        } else {
            this.myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) > -1) {
            this.myContacts.set(this.myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) > -1) {
            this.myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        for (Contact con : myContacts) {
            if (con.getName().equals(contact.getName())) {
                return myContacts.indexOf(con);
            }
        }
        return -1;
    }

    private int findContact(String contactName) {
        Contact tempContact = Contact.createContact(contactName, "-1");
        return findContact(tempContact);
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex > -1) {
            return this.myContacts.get(contactIndex);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact con : this.myContacts) {
            System.out.println((this.myContacts.indexOf(con) + 1) + ". " + con.getName() + " -> " + con.getPhoneNumber());
        }
    }
}
