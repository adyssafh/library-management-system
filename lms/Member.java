package lms;

import java.util.ArrayList;
import java.util.List;

public class Member {
    protected int memberId;
    public String name;
    public List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        book.borrowBook();
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i).title == book.title) {
                borrowedBooks.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}
