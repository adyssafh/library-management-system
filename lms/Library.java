package lms;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    public List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void registerMember(Member member) {
        this.members.add(member);
    }

    public String findBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title == title) {
                return "Book availabe: " + books.get(i).toString();
            }
        }
        return "Book not available";
    }

    public String displayAvailableBooks() {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : books) {
            bookTitles.add(book.title);
        }
        return String.join(", ", bookTitles);
    }
}
