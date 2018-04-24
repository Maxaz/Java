import java.util.ArrayList;

public class ContactsList {

    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public void addContact(String name, int phoneNo) {
//        Contact newContact = new Contact(name, phoneNo);
        if (!isCreated(new Contact(name, phoneNo))) {
            contactsList.add(new Contact(name, phoneNo));
        }
    }

    public void printContactList() {
        System.out.println("You have " + contactsList.size() + " contacts in your contact list");
        for (Contact c : contactsList) {
            System.out.println("Contact " + c.getContactName() + " and his number: " + c.getContactNo());
        }
    }

    public void modifyContact(String currentContact, String newContactName, int newContactNo) {
        int position = findItem(currentContact);
        if (position >= 0) {
            modifyContactItem(position, newContactName, newContactNo);
        }
    }

    public void modifyContact(String currentContact, int newContactNo) {
        int position = findItem(currentContact);
        if (position >= 0) {
            modifyContactItem(position, newContactNo);
        }
    }

    private void modifyContactItem(int position, String newContactName, int newContactNo) {
        contactsList.get(position).setContactName(newContactName);
        contactsList.get(position).setContactNo(newContactNo);
        System.out.println("Contact item " + (position + 1) + " has been modified");
    }

    private void modifyContactItem(int position, int newContactNo) {
        contactsList.get(position).setContactNo(newContactNo);
        System.out.println("Contact " + contactsList.get(position).getContactName() + " " + "number changed to: " + contactsList.get(position).getContactNo());
    }

    private int findItem(String searchContact) {
        int index = -1;
        for (Contact c : contactsList) {
            if (c.getContactName().equals(searchContact)) {
                index = contactsList.indexOf(c);
            }
        }
        return index;
    }

    public void removeContact(String contactName) {
        int position = findItem(contactName);
        if (position >= 0) {
            removeContactItem(position);
        }
    }

    private void removeContactItem(int position) {
        contactsList.remove(position);
    }

    private boolean isCreated(Contact contact) {
        if (findItem(contact.getContactName()) >= 0) {
            return true;
        }
        return false;
    }
}
