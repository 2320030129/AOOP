package library;

import members.Member;
import borrowing.Borrowing;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Borrowing> borrowings;

    public Library() {
        books = new ArrayList<>();
        borrowings = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book, Member member) {
        Borrowing borrowing = new Borrowing(book, member);
        borrowings.add(borrowing);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }
}
