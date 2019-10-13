package bookshelf;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

class BookShelfTest {

    @Rule
    public ExpectedException expectedException=ExpectedException.none();

    @Test
    public void should_be_able_to_add_a_book() {
        BookShelf bookShelf=new BookShelf();
        Book book=new Book.Builder().withAuthor("Shekhar Gulhati").withTitle("Junit").build();
        boolean bookAdded=bookShelf.add(book);
        assertThat(bookAdded).isTrue();
    }
    @Test
    public void should_be_able_to_add_multiple_books() {
        BookShelf bookShelf=new BookShelf();
        Book book1 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Junit").withBookType(BookType.EBOOK).build();
        Book book2 = new Book.Builder().withAuthor("Bobby Deol").withTitle("Python").withBookType(BookType.EBOOK).build();
        Book book3 = new Book.Builder().withAuthor("Dharmendra").withTitle("Spring").withBookType(BookType.PAPERBACK).build();
        Book book4 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Math").withBookType(BookType.EBOOK).build();
        Book book5 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Python").withBookType(BookType.PAPERBACK).build();
        Book book6 = new Book.Builder().withAuthor("Dharmendra").withTitle("English").withBookType(BookType.EBOOK).build();
        boolean booksAdded=bookShelf.add(book1,book2,book3,book4,book5,book6);
        assertThat(booksAdded).isTrue();
    }

    @Test
    public void should_not_add_same_book_again() {
        BookShelf bookShelf=new BookShelf();
        Book book1=new Book.Builder().withAuthor("Shekhar Gulhati").withTitle("Junit").withBookType(BookType.EBOOK).build();
        expectedException.expect(IllegalArgumentException.class);
        bookShelf.add(book1,book1);
        Assertions.fail("Your test case should not pass");

    }
    @Test
    public void should_be_able_to_delete_a_book() {
        BookShelf bookShelf=new BookShelf();
        Book book=new Book.Builder().withAuthor("Shekhar Gulhati").withTitle("Junit").withBookType(BookType.EBOOK).build();
        bookShelf.add(book);
        boolean bookDeleted=bookShelf.delete(book);
        assertThat(bookDeleted).isTrue();
    }



    @Test
    public void should_be_able_to_search_using_multiple_parameters() {
        BookShelf bookShelf = new BookShelf();
        Book book1 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Junit").withBookType(BookType.EBOOK).build();
        Book book2 = new Book.Builder().withAuthor("Bobby Deol").withTitle("Python").withBookType(BookType.EBOOK).build();
        Book book3 = new Book.Builder().withAuthor("Dharmendra").withTitle("Spring").withBookType(BookType.PAPERBACK).build();
        Book book4 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Math").withBookType(BookType.EBOOK).build();
        Book book5 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Python").withBookType(BookType.PAPERBACK).build();
        Book book6 = new Book.Builder().withAuthor("Dharmendra").withTitle("English").withBookType(BookType.EBOOK).build();
        bookShelf.add(book1, book2, book3, book4, book5, book6);
        List<Book> foundedBooks = bookShelf.searchBooks(new BookSpecification.Builder().withTitle("python").build());
        assertThat(foundedBooks).hasSize(2);
        assertThat(foundedBooks).contains(book5,book2);
    }


    @Test
    public void should_sort_books_by_ascending_order() {
        BookShelf bookShelf=new BookShelf();
        Book book1 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Junit").withBookType(BookType.EBOOK).build();
        Book book2 = new Book.Builder().withAuthor("Bobby Deol").withTitle("Python").withBookType(BookType.EBOOK).build();
        Book book3 = new Book.Builder().withAuthor("Dharmendra").withTitle("Spring").withBookType(BookType.PAPERBACK).build();
        Book book4 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Math").withBookType(BookType.EBOOK).build();
        Book book5 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Python").withBookType(BookType.PAPERBACK).build();
        Book book6 = new Book.Builder().withAuthor("Dharmendra").withTitle("English").withBookType(BookType.EBOOK).build();
        bookShelf.add(book1,book2,book3,book4,book5,book6);
        Set<Book> sortedBooks = bookShelf.sort();
        assertThat(sortedBooks).hasSize(6);
        assertThat( sortedBooks).containsSequence(book6,book1,book4,book2,book5,book3);
    }
    @Test
    public void should_sort_books_by_descending_order() {
        BookShelf bookShelf=new BookShelf();
        Book book1 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Junit").withBookType(BookType.EBOOK).build();
        Book book2 = new Book.Builder().withAuthor("Bobby Deol").withTitle("Python").withBookType(BookType.EBOOK).build();
        Book book3 = new Book.Builder().withAuthor("Dharmendra").withTitle("Spring").withBookType(BookType.PAPERBACK).build();
        Book book4 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Math").withBookType(BookType.EBOOK).build();
        Book book5 = new Book.Builder().withAuthor("Sunny Deol").withTitle("Python").withBookType(BookType.PAPERBACK).build();
        Book book6 = new Book.Builder().withAuthor("Dharmendra").withTitle("English").withBookType(BookType.EBOOK).build();
        bookShelf.add(book1,book2,book3,book4,book5,book6);
        Set<Book> sorted = bookShelf.sort( new Comparator<Book>() {

            public int compare(Book o1, Book o2) {
                //if we have two books with same title we will check for author
                int flag=o2.getTitle().compareToIgnoreCase(o1.getTitle());
                if(flag==0)
                    flag=o2.getAuthor().compareToIgnoreCase(o1.getAuthor());
                return flag;
            }
        } );
        assertThat(sorted).hasSize(6);
        assertThat( sorted ).containsSequence(book3,book5,book2,book4,book1,book6 );
    }
    @Test
    public  void should_be_able_to_share_the_book() {
        BookShelf bookShelf=new BookShelf();
        Book book1=new Book.Builder().withAuthor("Shekhar Gulhati").withTitle("Junit").withBookType(BookType.EBOOK).withShouldShare(true).build();
        Book book2=new Book.Builder().withAuthor("Shekhar Gulhati").withTitle("Junit").withBookType(BookType.EBOOK).withShouldShare(false).build();
        Book book3=new Book.Builder().withAuthor("John Snow").withTitle("Python").withBookType(BookType.EBOOK).withShouldShare(true).build();
        Book book4=new Book.Builder().withAuthor("Ramsay Bolton").withTitle("Java").withBookType(BookType.EBOOK).withShouldShare(true).build();
        Book book5=new Book.Builder().withAuthor("").withTitle("Khal Drogo").withBookType(BookType.EBOOK).withShouldShare(true).build();
        bookShelf.add(book1,book2,book3,book4,book5);

        //when we want all the books that can be shared
        Set<Book> bookShared1=bookShelf.shareBooks(new BookSpecification.Builder().build());
        assertThat(bookShared1).hasSize(4);
        assertThat(bookShared1).contains(book1,book3,book4,book5);



        // when we want all junit books that cane be shared
        Set<Book> bookShared2=bookShelf.shareBooks(new BookSpecification.Builder().withTitle("junit").build());
        assertThat(bookShared2).hasSize(1);
        assertThat(bookShared2).contains(book1);

        //when we want al shekar books that can be shared
        Set<Book> bookShared3=bookShelf.shareBooks(new BookSpecification.Builder().withAuthor("Shekhar Gulhati").build());
        assertThat(bookShared3).hasSize(1);
        assertThat(bookShared3).contains(book1);


    }
}