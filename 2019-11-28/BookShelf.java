import java.util.Arrays;

public class BookShelf {
    private static final BookShelf instance = new BookShelf();
    private BookShelf() {}

    public static BookShelf getBookShelf() {
        return instance;
    }

    Book[] array = new Book[100];
    int size;

    public void add(Book book) {
        array[size++] = book;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(array, size);
    }
}
