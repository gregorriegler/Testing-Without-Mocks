package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class BookRepositoryContract {
    private final BookRepository repository = createRepository();

    protected abstract BookRepository createRepository();

    @BeforeEach
    public void clean() {
        repository.clear();
    }

    @Test
    public void createAndFindAll() {
        repository.save(new Book("123", "Name"));
        repository.save(new Book("456", "Name2"));

        assertThat(repository.findAll()).containsExactly(
            new Book("123", "Name"),
            new Book("456", "Name2")
        );
    }
}
