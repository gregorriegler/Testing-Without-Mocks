package smells.mocked_values;

public class SUT {

    private BookRepository bookRepository;

    public SUT(BookRepository cacheHandler) {
        this.bookRepository = cacheHandler;
    }

    public String action(String test) {
        return "";
    }

    public void save(Book book) {

    }
}
