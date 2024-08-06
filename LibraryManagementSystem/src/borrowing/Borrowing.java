package borrowing;

import library.Book;
import members.Member;

public class Borrowing {
    private Book book;
    private Member member;

    public Borrowing(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
