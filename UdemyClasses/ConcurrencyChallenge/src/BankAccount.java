//class BankAccount {
//
//    private double balance;
//    private String accountNumber;
//    private Lock accLock;
//
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//        this.accLock = new ReentrantLock();
//    }
//
//    public void deposit(double amount) {
//        boolean status = false;
//        try {
//            if (accLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance += amount;
//                    status = true;
//                } finally {
//                    accLock.unlock();
//                }
//            } else {
//                System.out.println("Could not get the lock.");
//            }
//        } catch (InterruptedException e) {
//            // smth
//        }
//
//        System.out.println("Transaction status " + status);
//    }
//
//    public void withdraw(double amount) {
//        boolean status = false;
//
//        try {
//            if (accLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
//                try {
//                    balance -= amount;
//                    status = true;
//                } finally {
//                    accLock.unlock();
//                }
//            } else {
//                System.out.println("Could not get the lock.");
//            }
//        } catch (InterruptedException e) {
//            // smth
//        }
//
//        System.out.println("Transaction status " + status);
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void printAccountNumber() {
//        System.out.println("the account number: " + this.getAccountNumber());
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//}