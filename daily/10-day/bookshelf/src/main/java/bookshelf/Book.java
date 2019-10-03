package bookshelf;

import java.util.Objects;

public class Book {


    private String title;
    private String author;
    private BookType bookType;
    private boolean shouldShare;

    public BookType getBookType() {
        return bookType;
    }
    public boolean getShouldShare() {
        return shouldShare;
    }
    private Book(Builder builder) {
        title = builder.title;
        author = builder.author;
        bookType=builder.bookType;
        shouldShare=builder.shouldShare;
    }

    public String getAuthor() {
        return author;
    }

    private Book(String title, String author,BookType bookType,boolean shouldShare) {
        this.title = title;
        this.author = author;
        this.bookType=bookType;
        this.shouldShare=shouldShare;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return shouldShare == book.shouldShare &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                bookType == book.bookType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author, bookType, shouldShare);
    }

    public static final class Builder {
        private String title;
        private String author;
        private BookType bookType;
        private  boolean shouldShare;

        public Builder() {
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withAuthor(String val) {
            author = val;
            return this;
        }
        public Builder withBookType(BookType val) {
            bookType=val;
            return  this;
        }
        public Builder withShouldShare(boolean val) {
            shouldShare=val;
            return  this;
        }

        public Book build() {
            return new Book(this);
        }
    }
    public boolean matches(BookSpecification toSearch) {
        BookSpecification bookSpec = new BookSpecification.Builder().withBookType(this.getBookType()).withAuthor(this.getAuthor()).withTitle(this.getTitle()).build();
        return bookSpec.matches(toSearch);
    }
    public boolean shouldShare(BookSpecification toSearch) {
        BookSpecification bookSpec=new BookSpecification.Builder().withAuthor(this.getAuthor()).withTitle(this.getTitle()).withBookType(this.getBookType()).withShouldShare(this.getShouldShare()).build();
        return bookSpec.shouldShare(toSearch);
    }
}