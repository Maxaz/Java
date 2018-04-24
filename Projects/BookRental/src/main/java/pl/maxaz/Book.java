package pl.maxaz;

import java.io.Serializable;
import java.util.*;

public class Book implements Serializable {
    private String title;
    private String author;
    private String ISBN;
    private int countOfCopies;
    private int countOfRented = 0;
    private Map<Integer, Calendar> copiesDatesOfRent = new Hashtable<>();
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

    private int getcountOfCopies() {
        return countOfCopies;
    }

    private int getCountOfRented() {
        return countOfRented;
    }

    private void setcountOfCopies(int countOfCopies) {
        this.countOfCopies = countOfCopies;
    }

    private void setcountOfRented(int countOfRented) {
        this.countOfRented = countOfRented;
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
        setcountOfCopies(getcountOfCopies() + 1);
        copiesDatesOfRent.put(countOfCopies, newBookDate());
        return true;
    }

    boolean addCopy(int numberOfCopies) {
        if (numberOfCopies > 0) {
            for (int i = 1; i <= numberOfCopies; i++) {
                setcountOfCopies(getcountOfCopies() + 1);
                copiesDatesOfRent.put(countOfCopies, newBookDate());
            }
            return true;
        }
        return false;
    }

    boolean removeCopy(Integer copyNumber) {
        if ((getcountOfCopies() > 0) && (countOfRented < countOfCopies) && (copiesDatesOfRent.containsKey(copyNumber))) {
            copiesDatesOfRent.remove(copyNumber);
            setcountOfCopies(getcountOfCopies() - 1);
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
                    setcountOfRented(countOfRented + 1);
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
                    setcountOfRented(countOfRented + 1);
                    return i;
                }
            }
        }
        return -1;
    }


    Long retrieveBook(Integer copyNumber) {
        if ((copyNumber > 0) && (copyNumber <= countOfCopies)) {
            Calendar dateOfRent = copiesDatesOfRent.get(copyNumber);
            Calendar rightNow = Calendar.getInstance();
            Long diff = rightNow.getTimeInMillis() - dateOfRent.getTimeInMillis();
            // Calculate difference in days
            Long diffDays = diff / (24 * 60 * 60 * 1000);
            copiesDatesOfRent.put(copyNumber, newBookDate());
            setcountOfRented(countOfRented - 1);
            return diffDays;
        }
        return -1L;
    }

    Calendar newBookDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(0));
        return cal;
    }

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
