package pl.maxaz;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Account implements Serializable {
    private String name;
    private String id;
    private Map<Book, Integer> listOfRentedBooks = new HashMap<>();
    private boolean toBeRemoved = false;

    Account(String name, String id) {
        this.name = name;
        this.id = id;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setToBeRemoved(boolean toBeRemoved) {
        this.toBeRemoved = toBeRemoved;
    }

    boolean assignBook(Book book){
        if (book != null){
            Integer copyNumber = book.rentBook();
            if (copyNumber > 0){
                listOfRentedBooks.put(book, copyNumber);
                return true;
            }
        }
        return false;
    }

    //for test purposes
    boolean assignBook(Book book, Calendar date){
        if (book != null){
            Integer copyNumber = book.rentBook(date);
            if (copyNumber > 0){
                listOfRentedBooks.put(book, copyNumber);
                return true;
            }
        }
        return false;
    }

    Integer unassignBook(Book book){
        if (book != null){
            Integer copyNumber = listOfRentedBooks.get(book);
            listOfRentedBooks.remove(book);
            return copyNumber;
        }
        return 0;
    }

    Integer getRentedBookCopyNumber(Book book){
        for(Book b : listOfRentedBooks.keySet()){
            if (b.getISBN().equals(book.getISBN())) return listOfRentedBooks.get(b);
        }
        return null;
    }
    private String displayRentedBooks(){
        StringBuilder sb = new StringBuilder();
        for(Book b : listOfRentedBooks.keySet()) {
            sb.append(b.getTitle());
            sb.append("; ");
        }
        if (!sb.toString().isEmpty()) sb.replace(sb.length()-2,sb.length(), "");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id) + 45;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", listOfRentedBooks contains books= " + listOfRentedBooks.size() +
                ", books: " + displayRentedBooks() +
                '}';
    }


}
