import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> bankBranches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public ArrayList<Branch> getBankBranches() {
        return bankBranches;
    }

    public void setBankBranches(ArrayList<Branch> bankBranches) {
        this.bankBranches = bankBranches;
    }

    public void addBranch(String name) {
        if (findBranch(name) < 0) {
            bankBranches.add(new Branch(name));
            System.out.println(name + " branch was added to " + bankName);
        } else {
            System.out.println(name + "'s already existing.");
        }
    }

    private int findBranch(String branchName) {
        for (int i = 0; i < this.bankBranches.size(); i++) {
            if (bankBranches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    private int findCustomer(String customerName) {
        for (int i = 0; i < this.bankBranches.size(); i++) {
            if (bankBranches.get(i).findCustomer(customerName) >= 0) {
                return i;
            }
        }
        return -1;
    }

    private int findCustomerBranch(String customerName) {
        for (int i = 0; i < bankBranches.size(); i++) {
            if (bankBranches.get(i).findCustomer(customerName) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public void addCustomerToBranch(String branchName, String newCustomerName, double initialValue) {

        if (findBranch(branchName) >= 0 && findCustomer(newCustomerName) == -1) {
            bankBranches.get(findBranch(branchName)).addCustomer(newCustomerName, initialValue);
        } else {
            System.out.println(branchName + " was not found or the new customer exists under another branch. Customer was not added.");
            if (findCustomerBranch(newCustomerName) >= 0) {
                System.out.println("Customer exists under branch: " + bankBranches.get(findCustomerBranch(newCustomerName)));
            }
        }
    }

    public void addTransactionToCustomer(String customerName, double value) {
        if (findCustomer(customerName) >= 0) {
            bankBranches.get(findCustomerBranch(customerName)).addNewTransaction(customerName, value);
        }
    }

    public void displayAllBranches() {
        System.out.println("Showing all branches");
        for (int i = 0; i < bankBranches.size(); i++) {
            System.out.println("Bank branch no. " + (i+1) + " -> " + bankBranches.get(i).getBranchName());
        }
    }

    public void displayAllCustomers(String name) {
        if (findBranch(name) >= 0) {
            for (int i = 0; i < bankBranches.get(findBranch(name)).getBranchCustomers().size(); i++) {
                System.out.println("Customer of " + name + " -> no. " + i + " -> " + bankBranches.get(findBranch(name)).getBranchCustomers().get(i).getCustomerName());
            }
        }

    }

    public void displayCustomerTransactions(String customerName) {
        if (findCustomer(customerName) >= 0) {
            bankBranches.get(findCustomerBranch(customerName)).getBranchCustomers().get(findCustomer(customerName)).displayAllTransactions();
        }
    }
}
