import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank myBank = new Bank("My New Bank");
        boolean quit = false;
        showOptions();
        while (!quit) {
            System.out.println("Enter option: ");
            int decision = scanner.nextInt();
            scanner.nextLine();

            switch (decision) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Provide the name for the new branch: ");
                    myBank.addBranch(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Provide the name for a new customer: ");
                    String name = scanner.nextLine();

                    System.out.println("Provide the initial amount for this customer: ");
                    double initialAmount = scanner.nextDouble();

                    System.out.println("In which branch should it be added?");
                    myBank.displayAllBranches();
                    scanner.nextLine();

                    System.out.println("Provide the name of the branch: ");
                    String branchName = scanner.nextLine();

                    myBank.addCustomerToBranch(branchName, name, initialAmount);
                    break;
                case 3:
                    System.out.println("Provide the name of the Customer: ");
                    String customerName = scanner.nextLine();

                    System.out.println("Provide the amount: ");
                    double customerAmount = scanner.nextDouble();

                    myBank.addTransactionToCustomer(customerName, customerAmount);
                    System.out.println("Added " + customerAmount + " to " + customerName);
                    break;
                case 4:
                    myBank.displayAllBranches();
                    break;
                case 5:
                    System.out.println("Provide the name of the branch: ");
                    myBank.displayAllCustomers(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Provide the name of the Customer: ");
                    myBank.displayCustomerTransactions(scanner.nextLine());
                    break;
                case 7:
                    showOptions();
                    break;
            }
        }
    }

    private static void showOptions() {
        System.out.println("Select 0 - to quit");
        System.out.println("Select 1 - to add a branch");
        System.out.println("Select 2 - to add a customer");
        System.out.println("Select 3 - to add a transaction");
        System.out.println("Select 4 - to show branches");
        System.out.println("Select 5 - to show customers");
        System.out.println("Select 6 - to show customer's transactions");
        System.out.println("Select 7 - to show options");
    }
}
