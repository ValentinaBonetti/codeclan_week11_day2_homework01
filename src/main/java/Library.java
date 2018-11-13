import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;
    private int libraryCapacity = 1;

    public Library(String libraryName){
        this.name = libraryName;
        this.collection = new ArrayList<Book>();
    }

    public int getLibraryCapacity(){
        return this.libraryCapacity;
    }

    public int countBooksInCollection(){
        return this.collection.size();
    }

    public void add(Book book) {
        if (countBooksInCollection()<libraryCapacity) {
            this.collection.add(book);
        }
    }

    public void remove(Book book){
        if(this.collection.contains(book)){
            this.collection.remove(book);
        }

    }

    public boolean checkIfBookInCollection(Book book) {
        return this.collection.contains(book);
    }
}
