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


}
