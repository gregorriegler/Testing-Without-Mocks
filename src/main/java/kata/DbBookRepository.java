package kata;

import java.util.List;
import java.util.stream.Collectors;

public class DbBookRepository implements BookRepository {
    public DbBookRepository() {
    }

    @Override
    public void save(Book book) {
        Db.persist(book);
    }

    @Override
    public List<Book> findAll() {
        return Db.findAll().stream()
            .map(it -> (Book) it)
            .collect(Collectors.toList());
    }

    @Override
    public void clear() {
        Db.clear();
    }
}