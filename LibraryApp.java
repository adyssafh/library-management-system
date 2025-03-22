
import lms.Book;
import lms.Member;

public class LibraryApp {

    public static void main(String[] args) {
        Book yellowFace = new Book(1, "Yellow Face", "R.F Kuang", 2);
        Member mamat = new Member(1, "mamat");
        System.out.println(yellowFace.availableCopies);
        mamat.borrowBook(yellowFace);
        System.out.println(yellowFace.availableCopies);
        System.out.println(mamat.borrowedBooks.get(0).title);
        mamat.returnBook(yellowFace);
        System.out.println(yellowFace.availableCopies);
        System.out.println(mamat.borrowedBooks);
    }
}