public class Book {
    private String bookName;
    private int bookAge;
    private String bookAuthor;

    public Book(String bookName, int bookAge, String bookAuthor) {
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

    public String getBookAuthor() {
        return this.bookAuthor;
    }
    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }


}
