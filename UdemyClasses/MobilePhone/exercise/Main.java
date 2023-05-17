package MobilePhone.exercise;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("1234567");
        myPhone.addNewContact(Contact.createContact("Anna", "321321"));
//        System.out.println(myPhone.addNewContact(Contact.createContact("Anna", "321321")));
//        System.out.println(Contact.createContact("Anna", "321321").equals(Contact.createContact("Anna", "321321")));
//        String s1 = "Anna";
//        String s2 = "Anna";
//        System.out.println(s1.equals(s2));
//        System.out.println("anna".toString().equals("anna".toString()));
//        System.out.println(myPhone.queryContact("Anna"));
        myPhone.addNewContact(Contact.createContact("Bob", "123321"));
        myPhone.addNewContact(Contact.createContact("Karo", "321123"));
        myPhone.printContacts();
    }
}
