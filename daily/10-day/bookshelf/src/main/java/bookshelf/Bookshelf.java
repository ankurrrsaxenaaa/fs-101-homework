package bookshelf;

import java.util.*;

class BookShelf {
    private Set<Book> books=new HashSet<Book>();
    public boolean add(Book... book) {
        boolean booksAdded=false;
        for(Book booksToAdd:book) {
            if(books.contains(booksToAdd))
                throw new IllegalArgumentException("The book you are trying to add already exists in shelf");
            booksAdded=books.add(booksToAdd);
        }
        return  booksAdded;
    }

    public boolean delete(Book book) {
        return books.remove(book);
    }


    public List<Book> searchBooks(BookSpecification bookToSearch) {
        List<Book> booksFound = new ArrayList<Book>();
        for (Book currentBook : books) {
            if (currentBook.matches(bookToSearch))
                booksFound.add(currentBook);

        }
        return booksFound;
    }

    public Set<Book> sort() {
        return sort(new Comparator<Book>() {

            public int compare(Book o1, Book o2) {
                //case when there are two books of same title
                int flag=o1.getTitle().compareToIgnoreCase(o2.getTitle());
                if(flag==0)
                    flag=o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
                return flag;
            }
        });
    }
    public Set<Book> sort(Comparator<Book> comparator) {
        Set<Book> sorted = new TreeSet<Book>(comparator);
        sorted.addAll(this.books);
        return sorted;
    }

    public Set<Book> shareBooks(BookSpecification bookSpecification) {
        Set<Book> sharedBooks=new HashSet<Book>();
        for(Book book:books) {
            if (book.shouldShare(bookSpecification))
                sharedBooks.add(book);
        }
        return  sharedBooks;
    }
}