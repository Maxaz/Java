package Bank.exercise;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String nameOfBranch) {
        Branch branch = findBranch(nameOfBranch);
        if (branch == null) {
            branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            return branch.newCustomer(nameOfCustomer, initialTransaction);
        }
        return false;

    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, Double transaction) {
        Branch branch = findBranch(nameOfBranch);
        if (branch != null) {
            return branch.addCustomerTransaction(nameOfCustomer, transaction);
        }
        return false;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch branch = findBranch(nameOfBranch);
//        System.out.println(branch);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer) + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (Double transaction : customer.getTransactions()) {
                        System.out.println("[" + (customer.getTransactions().indexOf(transaction) + 1) + "]  Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;

    }
}
