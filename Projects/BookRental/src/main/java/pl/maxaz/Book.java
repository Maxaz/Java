package pl.maxaz;

import java.io.Serializable;
import java.util.*;

public class Book implements Serializable {
    private final String ISBN; //it's used in hashCode. It should be immutable
    private String title;
    private String author;
    private int countOfCopies;
    private int countOfRented = 0;
    private Map<Integer, Calendar> copiesDatesOfRent = new Hashtable<>(); // Calendar is bad type.
    private boolean toBeRemoved = false;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.countOfCopies = 0;
        addCopy();
    }

    Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.countOfCopies = 0;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getISBN() {
        return ISBN;
    }

    private int getCountOfCopies() {
        return countOfCopies;
    }

    private int getCountOfRented() {
        return countOfRented;
    }

    private void incrementCountOfCopies(int amount) {
        this.countOfCopies+=amount;
    }

    private void incrementCountOfRented(int amount) {
        this.countOfRented+=amount;
    }

    void setToBeRemoved() {
        setToBeRemoved(true);
    }

    private void setToBeRemoved(boolean toBeRemoved) {
        this.toBeRemoved = toBeRemoved;
    }

    Map getCopiesDatesOfRent() {
        return new HashMap<>(copiesDatesOfRent);
    }

    boolean addCopy() {
        incrementCountOfCopies(1);
        copiesDatesOfRent.put(countOfCopies, newBookDate());
        return true;
    }

    boolean addCopy(int numberOfCopies) {
        if (numberOfCopies > 0) {
            for (int i = 1; i <= numberOfCopies; i++) {
                incrementCountOfCopies( 1);
                copiesDatesOfRent.put(countOfCopies, newBookDate());
            }
            return true;
        }
        return false;
    }

    boolean removeCopy(Integer copyNumber) {
        if ((getCountOfCopies() > 0) && (countOfRented < countOfCopies) && (copiesDatesOfRent.containsKey(copyNumber))) {
            copiesDatesOfRent.remove(copyNumber);
            incrementCountOfCopies( -1);
            return true;
        }
        return false;
    }


    Integer rentBook() {
        if (countOfRented < copiesDatesOfRent.size()) {
            for (Integer i : copiesDatesOfRent.keySet()) {
                if (copiesDatesOfRent.get(i).getTime().equals(newBookDate().getTime())) {
                    Calendar rightNow = Calendar.getInstance();
                    copiesDatesOfRent.put(i, rightNow);
                    incrementCountOfRented( 1);
                    return i;
                }
            }
        }
        return -1;
    }

    //for test purposes
    Integer rentBook(Calendar date) {
        if (countOfRented < copiesDatesOfRent.size()) {
            for (Integer i : copiesDatesOfRent.keySet()) {
                if (copiesDatesOfRent.get(i).getTime().equals(newBookDate().getTime())) {
                    copiesDatesOfRent.put(i, date);
                    incrementCountOfRented( 1);
                    return i;
                }
            }
        }
        return -1;
    }

    // AVOID using the Calendar and Date types. Read about java.time.* classes
    // Calendar and Date types have very bad API,
    // Instead Date use LocalDateTime or LocalDate
    Long retrieveBook(Integer copyNumber) {
        if ((copyNumber > 0) && (copyNumber <= countOfCopies)) {
            Calendar dateOfRent = copiesDatesOfRent.get(copyNumber);
            Calendar rightNow = Calendar.getInstance();
            Long diff = rightNow.getTimeInMillis() - dateOfRent.getTimeInMillis();
            // Calculate difference in days
            Long diffDays = diff / (24 * 60 * 60 * 1000);
            copiesDatesOfRent.put(copyNumber, newBookDate());
            incrementCountOfRented( - 1);
            return diffDays;
        }
        return -1L;
    }

    //NO :D
    Calendar newBookDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(0));
        return cal;
    }

    //good contract between equals and hashCode.
    //NICE!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", countOfCopies=" + countOfCopies +
                ", countOfRented=" + countOfRented +
                ", toBeRemoved=" + toBeRemoved +
                '}';
    }
}
