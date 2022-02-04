package kata;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;
    private final DomainService domainService = new DomainService();

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void create(String isbn, String name) {
        int size = bookRepository.findAll().size();
        Book book = domainService.createBook(isbn, name, size + 1);
        bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

}
