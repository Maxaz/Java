public class Main {

    private static ContactsList cList = new ContactsList();

    public static void main (String[] args){
        cList.addContact("janek", 12343321);
        cList.addContact("jsk", 122321);
        cList.addContact("aek", 1234221);
        cList.addContact("jd", 1221);
        cList.printContactList();
        cList.removeContact("jsk");
        cList.printContactList();
        cList.modifyContact("janek",11111);
        cList.printContactList();
        }
}

