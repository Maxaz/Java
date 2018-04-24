public class Contact {

    private String contactName;
    private int contactNo;

    public Contact(String contactName, int contactNo) {
        this.contactName = contactName;
        this.contactNo = contactNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
}
