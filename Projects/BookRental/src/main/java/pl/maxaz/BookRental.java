package pl.maxaz;

import java.io.Serializable;
import java.util.*;

public class BookRental implements Serializable {
    private Set<pl.maxaz.Book> bookSet;
    private Set<pl.maxaz.Account> accountSet;

    public BookRental() {
        this.bookSet = new HashSet<>();
        this.accountSet = new LinkedHashSet<>();
    }

    public Set<pl.maxaz.Book> getBookSet() {
        return new HashSet<>(bookSet);
    }

    public Set<pl.maxaz.Account> getAccountSet() {
        return new LinkedHashSet<>(accountSet);
    }

    public boolean createBook(String title, String author, String ISBN) {
        if ((title != null) && (author != null) && (ISBN != null)) {

            pl.maxaz.Book book = new Book(title, author, ISBN);
            //in case of duplicate hashset will not replace or add.
            bookSet.add(book);
            return true;

        }
        return false;
    }

    public boolean deleteBook(Book book) {
        if (book != null) {
            bookSet.remove(book);
            book.setToBeRemoved();
            return true;
        }
        return false;
    }

    public boolean createAccount(String name) {
        if (name != null) {
            Integer idValue = 0;
            if (accountSet.isEmpty()) {
                idValue++;
            } else {
                Iterator<pl.maxaz.Account> it = accountSet.iterator();
                pl.maxaz.Account value = it.next();

                while (it.hasNext()) {
                    value = it.next();
                }
                idValue = Integer.parseInt(value.getId()) + 1;
            }
            // geting the last id from set
            String idValueString = idValue.toString();
            // creating a new id
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = idValueString.length(); i < 4; i++) {
                stringBuilder.append("0");
            }
            stringBuilder.append(idValueString);
            // add created account to set
            pl.maxaz.Account account = new pl.maxaz.Account(name, stringBuilder.toString());
            accountSet.add(account);
            return true;
        }
        return false;
    }

    public boolean deleteAccount(pl.maxaz.Account account) {
        if (account != null) {
            account.setToBeRemoved(true);
            accountSet.remove(account);
            return true;
        }
        return false;
    }

    public pl.maxaz.Account findAccountByID(String id) {
        if (id != null) {
            for (pl.maxaz.Account account : accountSet) {
                if (account.getId().equals(id)) return account;
            }
        }
        return null;
    }

    public ArrayList<pl.maxaz.Account> findAccountByName(String name) {
        ArrayList<pl.maxaz.Account> foundAccounts = new ArrayList<>();

        if (name != null) {
            for (pl.maxaz.Account account : accountSet) {
                if (account.getName().equals(name)) foundAccounts.add(account);
            }
        }
        return foundAccounts;
    }

    public boolean assignRentedBook(Book book, pl.maxaz.Account account) {
        if ((bookSet.contains(book) && (accountSet.contains(account)))) {
            return account.assignBook(book);
        }
        return false;
    }

    //for test purposes
    public boolean assignRentedBook(Book book, pl.maxaz.Account account, Calendar date) {
        if ((book != null) && (account != null)) {
            return account.assignBook(book, date);
        }
        return false;
    }

    private Integer unassignRentedBook(Book book, pl.maxaz.Account account) {
        if ((book != null) && (account != null)) {
            return account.unassignBook(book);
        }
        return 0;
    }

    public Double checkOut(Book book, pl.maxaz.Account account) {
        Integer copyNumber = unassignRentedBook(book, account);
        if (copyNumber > 0) {
            double priceForADay = 0.20d;
            double daysDifference = (double) book.retrieveBook(copyNumber);
            if (daysDifference > 30) {
                return priceForADay * (daysDifference - 30);
            }
        }
        return 0.0d;
    }

    public ArrayList<Book> findBookByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        if (title != null) {
            for (Book book : bookSet) {
                if (book.getTitle().equals(title)) foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        if (author != null) {
            for (Book book : bookSet) {
                if (book.getAuthor().equals(author)) foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public Book findBookByISBN(String ISBN) {
        if (ISBN != null) {
            for (Book book : bookSet) {
                if (book.getISBN().equals(ISBN)) return book;
            }
        }
        return null;
    }

    public Calendar getTimeOfRent(pl.maxaz.Account account, Book book) {
        if ((account != null) && (book != null)) {
            Calendar cal = (Calendar) book.getCopiesDatesOfRent().get(account.getRentedBookCopyNumber(book));
            if (cal != null) {
                return cal;
            }
        }
        return new Book("", "", "").newBookDate();
    }

}
