import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> customerTransactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<Double>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public void setCustomerTransactions(ArrayList<Double> customerTransactions) {
        this.customerTransactions = customerTransactions;
    }

    public void addTransaction(double value){
        this.customerTransactions.add(value);
    }

    public void displayAllTransactions(){
        for (int i = 0; i < customerTransactions.size(); i++){
            System.out.println("Transaction no. " + (i+1)+ " -> " + customerTransactions.get(i));
        }
    }
}
