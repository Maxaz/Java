package pl.maxaz;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class BookRental implements Serializable {
    private Set<Book> bookSet;
    private Set<Account> accountSet;

    public BookRental() {
        this.bookSet = new HashSet<>();
        this.accountSet = new LinkedHashSet<>();
    }

    public Set<Book> getBookSet() {
        return new HashSet<>(bookSet);
    }

    public Set<Account> getAccountSet() {
        return new LinkedHashSet<>(accountSet);
    }

    public boolean createBook(String title, String author, String ISBN) {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
        Objects.requireNonNull(ISBN);

        Book book = new Book(title, author, ISBN);
        //in case of duplicate hashset will not replace or add.
        bookSet.add(book);
        return true;

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
            Account account = new Account(name, nextId());
            accountSet.add(account);
            return true;
        }
        return false;
    }

    private String nextId() {
        int idValue = 1;
        if (!accountSet.isEmpty()) {
            int maxId = accountSet.stream().mapToInt(account -> Integer.parseInt(account.getId())).max().getAsInt();
            idValue = maxId + 1;
        }
        String id= String.valueOf(idValue);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = id.length(); i < 4; i++) {
            stringBuilder.append("0");
        }
        return stringBuilder.append(id).toString();
    }

    public boolean deleteAccount(Account account) {
        if (account != null) {
            account.setToBeRemoved(true);
            accountSet.remove(account);
            return true;
        }
        return false;
    }

    public Account findAccountByID(String id) {
        if (id != null) {
            for (Account account : accountSet) {
                if (account.getId().equals(id)) return account;
            }
        }
        return null;
    }

    public List<Account> findAccountByName(String name) {
        Objects.requireNonNull(name);
        return accountSet.stream().filter(account -> name.equals(account.getName())).collect(Collectors.toList());
    }

    public boolean assignRentedBook(Book book, Account account) {
        if ((bookSet.contains(book) && (accountSet.contains(account)))) {
            return account.assignBook(book);
        }
        return false;
    }

    //for test purposes
    public boolean assignRentedBook(Book book, Account account, Calendar date) {
        if ((book != null) && (account != null)) {
            return account.assignBook(book, date);
        }
        return false;
    }

    private Integer unassignRentedBook(Book book, Account account) {
        if ((book != null) && (account != null)) {
            return account.unassignBook(book);
        }
        return 0;
    }

    public Double checkOut(Book book, Account account) {
        Integer copyNumber = unassignRentedBook(book, account);
        if (copyNumber > 0) {
            double priceForADay = 0.20d;
            double daysDifference = (double) book.retrieveBook(copyNumber);
            int numberOfDaysWithoutExtraPayment = 30;
            if (daysDifference > numberOfDaysWithoutExtraPayment) {
                return priceForADay * (daysDifference - numberOfDaysWithoutExtraPayment);
            }
        }
        return 0.0d;
    }

    //in case of collections as a returned type, use the generic types like: List, Map, Set
    public List<Book> findBookByTitle(String title) {
        return bookSet.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    // try to use the steams like in: findAccountByName, findBookByTitle
    public List<Book> findBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        if (author != null) {
            for (Book book : bookSet) {
                if (book.getAuthor().equals(author)) foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // try to use the steams like in: findAccountByName, findBookByTitle
    public Book findBookByISBN(String ISBN) {
        if (ISBN != null) {
            for (Book book : bookSet) {
                if (book.getISBN().equals(ISBN)) return book;
            }
        }
        return null;
    }

    public Calendar getTimeOfRent(Account account, Book book) {
        if ((account != null) && (book != null)) {
            Calendar cal = (Calendar) book.getCopiesDatesOfRent().get(account.getRentedBookCopyNumber(book));
            if (cal != null) {
                return cal;
            }
        }
        return new Book("", "", "").newBookDate();
    }

}
