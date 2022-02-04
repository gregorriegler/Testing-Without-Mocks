package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookServiceTest {

    private final FakeBookRepository bookRepository = new FakeBookRepository();

    @BeforeEach
    public void clean() {
        bookRepository.clear();
    }

    @Test
    public void createAndFindAll() {
        BookService service = new BookService(bookRepository);

        service.create("123", "Name");
        service.create("456", "Name2");

        assertThat(service.findAll()).containsExactly(
            new Book("123", "Name"),
            new Book("456", "Name2")
        );
    }

}
