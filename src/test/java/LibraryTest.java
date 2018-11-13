import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library;
    Book book_01;
    Borrower vale;

    @Before
    public void setUp(){
        library = new Library("Whiteinch Library");
        book_01 = new Book("Alice's Adventures in Wonderland","Lewis Carroll","Fiction");
        vale = new Borrower("Valentina Bonetti");
    }

    @Test
    public void canAddBookToCollection(){
        library.add(book_01);
        assertEquals(1,library.countBooksInCollection());
    }

    @Test
    public void canCountBooksInCollection(){
        assertEquals(0,library.countBooksInCollection());
    }

    @Test
    public void stopsOnceCollectionCapacityReached(){
        for(int i = 0; i<library.getLibraryCapacity()+10; i++){
            library.add(book_01);
        }
        assertEquals(library.getLibraryCapacity(),library.countBooksInCollection());
    }

    @Test
    public void canCheckIfBookInCollection_True(){
        library.add(book_01);
        assertTrue(library.checkIfBookInCollection(book_01));
    }

    @Test
    public void canCheckIfBookInCollection_False(){
        assertFalse(library.checkIfBookInCollection(book_01));
    }

    @Test
    public void canRemoveBookIfInCollection(){
        library.add(book_01);
        library.remove(book_01);
        assertEquals(0,library.countBooksInCollection());
    }

    @Test
    public void removeFromCollectionWhenBorrowerTakesBook(){
        library.add(book_01);
        vale.borrowBookfromLibrary(library,book_01);
        assertEquals(0,library.countBooksInCollection());
        assertEquals(1,vale.numberOfBorrowedBooks());
    }

}
