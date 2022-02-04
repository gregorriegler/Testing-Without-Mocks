package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DomainServiceTest {

    DomainService domainService = new DomainService();

    @Test
    public void firstBookIsNotAnniversary() {
        Book book = domainService.createBook("123", "name", 1);
        assertThat(book.anniversaryType()).isEqualTo("none");
    }

    @Test
    public void tenthsBookIsAnniversary() {
        Book book = domainService.createBook("123", "name", 10);
        assertThat(book.anniversaryType()).isEqualTo("anniversary");
    }

    @Test
    public void hundredsBookIsGoldenAnniversary() {
        Book book = domainService.createBook("123", "name", 100);
        assertThat(book.anniversaryType()).isEqualTo("golden anniversary");
    }
}