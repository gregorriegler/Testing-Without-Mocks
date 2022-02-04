package kata;

public class DomainService {
    public DomainService() {
    }

    Book createBook(String isbn, String name, int nth) {
        String anniversaryType = getAnniversaryType(nth);
        return new Book(isbn, name, anniversaryType);
    }

    private String getAnniversaryType(int nth) {
        if (isGoldenAnniversary(nth)) {
            return "golden anniversary";
        }
        return isAnniversary(nth) ? "anniversary" : "none";
    }

    private boolean isAnniversary(int nth) {
        return nth % 10 == 0;
    }

    private boolean isGoldenAnniversary(int nth) {
        return nth % 100 == 0;
    }
}