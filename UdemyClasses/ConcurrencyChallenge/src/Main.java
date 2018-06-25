public class Main {

//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("12345-678", 1000.00);
//
//        Thread thr1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                account.getAccLock().lock();
//                account.deposit(300.00);
//                account.withdraw(50.00);
//                account.getAccLock().unlock();
//            }
//        });
//        Thread thr2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                account.getAccLock().lock();
//                account.deposit(203.75);
//                account.withdraw(100.00);
//                account.getAccLock().unlock();
//
//            }
//        });
//
//        thr1.run();
//        thr2.run();
//
//        System.out.println(account.getBalance());
//
//
//    }
}
