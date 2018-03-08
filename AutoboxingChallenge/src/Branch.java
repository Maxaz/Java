import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public void setBranchCustomers(ArrayList<Customer> branchCustomers) {
        this.branchCustomers = branchCustomers;
    }

    public void addCustomer(String name, double initialAmount) {
        if (findCustomer(name) < 0) {
            Customer newCustomer = new Customer(name);
            newCustomer.addTransaction(initialAmount);
            this.branchCustomers.add(newCustomer);
        } else {
            System.out.println(name + "'s account already exists. Please update.");
        }
    }

    public int findCustomer(String name) {
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            if (branchCustomers.get(i).getCustomerName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addNewTransaction(String name, double amount) {
        if (findCustomer(name) >= 0) {
            branchCustomers.get(findCustomer(name)).addTransaction(amount);
        } else  {
            System.out.println("Account not found.");
        }
    }
}
