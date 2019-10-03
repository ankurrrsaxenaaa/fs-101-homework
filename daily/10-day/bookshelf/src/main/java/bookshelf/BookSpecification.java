package bookshelf;

import java.util.Objects;

public class BookSpecification {
    private String author;
    private String title;
    private BookType bookType;
    private boolean shouldShare;

    private BookSpecification(Builder builder) {
        author = builder.author;
        title = builder.title;
        bookType = builder.bookType;
        shouldShare=builder.shouldShare;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }
    public boolean getShouldShare() {
        return shouldShare;
    }

    public BookSpecification(String author, String title, BookType bookType,boolean shouldShare) {
        this.author = author;
        this.title = title;
        this.shouldShare=shouldShare;
        this.bookType = bookType;
    }



    public static final class Builder {
        private String author;
        private String title;
        private BookType bookType;
        private boolean shouldShare;

        public Builder() {
        }

        public Builder withAuthor(String val) {
            author = val;
            return this;
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withBookType(BookType val) {
            bookType = val;
            return this;
        }
        public Builder withShouldShare(boolean val) {
            shouldShare=val;
            return this;
        }
        public BookSpecification build() {
            return new BookSpecification(this);
        }
    }
    public boolean matches(BookSpecification toSearch) {
        if (isNotEqualsCaseInsensative(toSearch.getAuthor(), this.getAuthor())) {
            return false;
        }

        if (isNotEqualsCaseInsensative(toSearch.getTitle(), this.getTitle())) {
            return false;
        }
        if (Objects.nonNull(toSearch.getBookType())
                && this.getBookType()!=toSearch.getBookType()) {
            return false;
        }
        return true;
    }
    private boolean isNotEqualsCaseInsensative(String author, String author2) {
        return Objects.nonNull(author)
                && !Objects.equals(author2.toLowerCase(), author.toLowerCase());
    }

    public boolean shouldShare(BookSpecification bookSpecification) {

        if(this.getTitle().equalsIgnoreCase(bookSpecification.getTitle()) && this.getShouldShare())
            return  true;
        else if(this.getAuthor().equalsIgnoreCase(bookSpecification.getAuthor()) && this.getShouldShare())
            return  true;
        else if(this.getBookType().equals(bookSpecification.getBookType()) && this.getShouldShare())
            return  true;
        if(bookSpecification.getAuthor()==null && bookSpecification.getTitle()==null && bookSpecification.getBookType()==null) {
            // if(bookSpecification.getShouldShare())
            return this.getShouldShare();
        }


        return  false;
    }
}
