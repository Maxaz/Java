import org.junit.Test;
import pl.maxaz.Account;
import pl.maxaz.Book;
import pl.maxaz.BookRental;

import java.util.Calendar;

import static org.junit.Assert.*;

public class BookRentalTest {

    @Test
    public void shouldCreateAndRent() {
        //given
        BookRental bookRental = new BookRental();

        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");
        book.addCopy(1);
        book.removeCopy(1);

        bookRental.createAccount("Max");
        Account account = bookRental.findAccountByName("Max").get(0);
        //when
        bookRental.assignRentedBook(book, account);
        //then
        for (Book b : bookRental.getBookSet()) {
            assertEquals(Integer.valueOf(2).toString(), account.getRentedBookCopyNumber(b).toString());
        }
    }

    @Test
    public void shouldNotRent() {
        //given
        BookRental bookRental = new BookRental();

        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account account = bookRental.findAccountByID("0001");

        //when
        bookRental.deleteBook(book);
        boolean isRented = bookRental.assignRentedBook(book, account);

        //then
        assertFalse("Book was rented", isRented);
    }

    @Test
    public void notEnoughCopies() {
        //given
        BookRental bookRental = new BookRental();

        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account maxAccount = bookRental.findAccountByName("Max").get(0);

        bookRental.createAccount("Alex");
        Account alexAccount = bookRental.findAccountByName("Alex").get(0);

        //when
        bookRental.assignRentedBook(book, maxAccount);
        boolean hasAlexGotHisBook = bookRental.assignRentedBook(book, alexAccount);
        //then
        assertFalse("Alex got his book, there was enough copies", hasAlexGotHisBook);
    }

    @Test
    public void enoughCopies() {
        //given
        BookRental bookRental = new BookRental();

        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account maxAccount = bookRental.findAccountByName("Max").get(0);

        bookRental.createAccount("Alex");
        Account alexAccount = bookRental.findAccountByName("Alex").get(0);

        //when
        bookRental.assignRentedBook(book, maxAccount);
        book.addCopy();
        boolean hasAlexGotHisBook = bookRental.assignRentedBook(book, alexAccount);
        //then
        assertTrue("Alex did not get his book, there was not enough copies", hasAlexGotHisBook);
    }

    @Test
    public void notEnoughCopiesDeletion() {
        //given
        BookRental bookRental = new BookRental();
        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account maxAccount = bookRental.findAccountByName("Max").get(0);

        //when
        book.removeCopy(1);
        boolean hasMaxGotHisBook = bookRental.assignRentedBook(book, maxAccount);
        //then
        assertFalse("Max got his book, there was enough copies", hasMaxGotHisBook);
    }

    @Test
    public void shouldNotPayForLateness() {
        //given
        BookRental bookRental = new BookRental();
        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account maxAccount = bookRental.findAccountByName("Max").get(0);

        //5 days after renting
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MILLISECOND, -432000000);

        //when
        bookRental.assignRentedBook(book, maxAccount, cal);
        double price = bookRental.checkOut(book,maxAccount);

        //then
        assertEquals(0.0d, price,0);
    }

    @Test
    public void shouldPayForLateness() {
        //given
        BookRental bookRental = new BookRental();
        bookRental.createBook("Head First Java, Second edition", "Kathy Sierra, Bert Bates", "978-83-246-2773-8");
        Book book = bookRental.findBookByISBN("978-83-246-2773-8");

        bookRental.createAccount("Max");
        Account maxAccount = bookRental.findAccountByName("Max").get(0);

        //35 days after renting
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MILLISECOND, -1512000000);
        cal.add(Calendar.MILLISECOND, -1512000000);


        //when
        bookRental.assignRentedBook(book, maxAccount, cal);
        double price = bookRental.checkOut(book,maxAccount);

        //then
        assertEquals(1.0d, price,0);
    }

}
