package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (obj == this) {
            return true;
        } else if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book)obj;
        boolean idEqual = (this.id == other.id);
        System.out.println(other.id + " " + this.id);
        System.out.println(idEqual);
        return idEqual;
        }
    }

