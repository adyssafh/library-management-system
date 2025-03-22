package lms;

public class Book {
    protected int bookId;
    public String title;
    public String author;
    public int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public void borrowBook() {
        this.availableCopies--;
    }

    public void returnBook() {
        this.availableCopies++;
    }

    // to String
}
