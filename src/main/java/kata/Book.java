package kata;

public record Book (
    String isbn,
    String name,
    String anniversaryType
) {
    public Book(String isbn, String name) {
        this(isbn, name, "none");
    }

    public String anniversaryType() {
        return anniversaryType;
    }

}

