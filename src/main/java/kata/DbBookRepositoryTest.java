package kata;

import org.junit.jupiter.api.Disabled;

@Disabled
public class DbBookRepositoryTest extends BookRepositoryContract {

    @Override
    protected BookRepository createRepository() {
        return new DbBookRepository();
    }
}
