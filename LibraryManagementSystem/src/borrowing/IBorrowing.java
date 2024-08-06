package borrowing;

import library.Book;
import members.Member;

public interface IBorrowing {
    void borrowBook(Book book, Member member);
}
