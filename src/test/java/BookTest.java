import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book_01;

    @Before
    public void setUp(){
        book_01 = new Book("Alice's Adventures in Wonderland","Lewis Carroll","Fiction");
    }

    @Test
    public void canGetTitle(){
        String book_01_title;
        book_01_title = book_01.getTitle();
        assertEquals("Alice's Adventures in Wonderland",book_01_title);

    }

}
