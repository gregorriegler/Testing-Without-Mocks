package kata;

public class FakeBookRepositoryTest extends BookRepositoryContract {

    @Override
    protected BookRepository createRepository() {
        return new FakeBookRepository();
    }
}
