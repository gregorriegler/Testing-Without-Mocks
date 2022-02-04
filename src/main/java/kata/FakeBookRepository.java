package kata;

import java.util.ArrayList;
import java.util.List;

public class FakeBookRepository implements BookRepository {

    List<Book> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public void clear() {
        books.clear();
    }
}
