package pl.maxaz;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        pl.maxaz.BookRental bookRental = new pl.maxaz.BookRental();

        // 3x books 2x accounts init
        bookRental.createBook("Head First Java, Second edition","Kathy Sierra, Bert Bates","978-83-246-2773-8");
        bookRental.createBook("American Gods", "Neil Gaiman","978-83-7480-050-1");
        bookRental.createBook("Guitar For Dummies, 3rd Edition","Mark Phillips, Jon Chappell", "978-83-246-7985-0");
        bookRental.createAccount("Max");
        bookRental.createAccount("Alex");

        Book book1 = bookRental.findBookByISBN("978-83-246-2773-8");
        bookRental.findBookByISBN("978-83-246-2773-8").addCopy();
        pl.maxaz.Book book2 = bookRental.findBookByISBN("978-83-7480-050-1");
        bookRental.findBookByISBN("978-83-7480-050-1").addCopy(9);

        pl.maxaz.Account account1 = bookRental.findAccountByID("0001");
        pl.maxaz.Account account2 = bookRental.findAccountByID("0002");

        bookRental.assignRentedBook(book1,account1);
        bookRental.assignRentedBook(book2,account1);
        bookRental.assignRentedBook(book2,account2);

//         Serialize
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("BookRentalSerialTest.ser"));
            os.writeObject(bookRental);
            os.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }


        // Deserialize
        pl.maxaz.BookRental bookRental1 = new pl.maxaz.BookRental();
         try {
             ObjectInputStream is = new ObjectInputStream(new FileInputStream("BookRentalSerialTest.ser"));
             bookRental1 = (pl.maxaz.BookRental) is.readObject();
         } catch (Exception ex){
             ex.printStackTrace();
         }

        for (Book b : bookRental1.getBookSet()) System.out.println(b);
        for (pl.maxaz.Account a : bookRental1.getAccountSet()) System.out.println(a);


    }
}
