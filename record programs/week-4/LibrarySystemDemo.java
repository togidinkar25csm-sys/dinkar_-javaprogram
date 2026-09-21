package task1;

import java.util.ArrayList;
import java.util.List;

// Base class - Inheritance
abstract class Person {
    protected String id;
    protected String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}


// Book class
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isIssued;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public boolean issue() {
        if (!isIssued) {
            isIssued = true;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.println(isbn + " | " + title + " by " + author
                + " | " + (isIssued ? "Issued" : "Available"));
    }
}


// Librarian class - Inheritance from Person (Aggregation with Library)
class Librarian extends Person {
    private String staffId;

    Librarian(String staffId, String name) {
        super(staffId, name);
        this.staffId = staffId;
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
        System.out.println(name + " registered book: " + book.getTitle());
    }
}


// Member class - Inheritance from Person, Association with Book
class Member extends Person {
    private List<Book> borrowedBooks = new ArrayList<>();

    Member(String id, String name) {
        super(id, name);
    }

    public void borrowBook(Library library, String isbn) {
        Book book = library.issueBook(isbn);
        if (book != null) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book unavailable for borrowing.");
        }
    }

    public void returnBook(Library library, String isbn) {
        for (Book b : borrowedBooks) {
            if (b.getIsbn().equals(isbn)) {
                library.returnBook(isbn);
                borrowedBooks.remove(b);
                System.out.println(name + " returned: " + b.getTitle());
                return;
            }
        }
        System.out.println(name + " does not have this book.");
    }
}


// Library class - Composition of Book, Aggregation of Librarian
class Library {
    private List<Book> books = new ArrayList<>();          // Composition
    private List<Librarian> librarians = new ArrayList<>(); // Aggregation

    public void addBook(Book book) {
        books.add(book);
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian); // Library references, doesn't own lifecycle
    }

    public Book issueBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn) && b.issue()) {
                return b;
            }
        }
        return null;
    }

    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                b.returnBook();
                return;
            }
        }
    }

    public void displayCatalog() {
        System.out.println("----- Library Catalog -----");
        for (Book b : books) {
            b.displayInfo();
        }
    }
}


// Main class
public class LibrarySystemDemo {
    public static void main(String[] args) {

        Library library = new Library();

        // Librarian registers books (aggregation + composition in action)
        Librarian librarian = new Librarian("L01", "Mr. Sharma");
        library.addLibrarian(librarian);

        librarian.registerBook(library, new Book("B001", "Clean Code", "Robert C. Martin"));
        librarian.registerBook(library, new Book("B002", "Effective Java", "Joshua Bloch"));

        System.out.println();
        library.displayCatalog();

        // Member borrows and returns books (association in action)
        Member member = new Member("M01", "Ananya");

        System.out.println("\n----- Borrowing -----");
        member.borrowBook(library, "B001");
        member.borrowBook(library, "B001"); // already issued

        System.out.println("\n----- Catalog After Borrowing -----");
        library.displayCatalog();

        System.out.println("\n----- Returning -----");
        member.returnBook(library, "B001");

        System.out.println("\n----- Catalog After Returning -----");
        library.displayCatalog();
    }
}