import java.util.Objects;

public class Book {
    private String bookName;
    private int bookAge;
    private Author bookAuthor;

    public Book(String bookName, int bookAge, Author bookAuthor) {
        this.bookName = bookName;
        this.bookAge = bookAge;
        this.bookAuthor = bookAuthor;

    }
    public String getBookName() {
        return this.bookName;
    }

    public int getBookAge() {
        return this.bookAge;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }
    public Author setBookAge(int bookAge) {
        this.bookAge = bookAge;
        return this.bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAge=" + bookAge +
                ", bookAuthor=" + bookAuthor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookAge == book.bookAge && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAge, bookAuthor);
    }
}
