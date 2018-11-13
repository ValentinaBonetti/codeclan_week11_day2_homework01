import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBookfromLibrary(Library library, Book book){
        if (library.checkIfBookInCollection(book)){
            library.remove(book);
            this.borrowedBooks.add(book);
        }
    }


    public int numberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }
}
