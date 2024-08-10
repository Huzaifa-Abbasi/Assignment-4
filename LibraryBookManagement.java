/*Library Book Management:
•	Create a Book class with attributes like title, author, ISBN, and availability status.
•	Create a Library class that manages a collection of books.
•	Implement methods to add books, search for books, and check out/return books.
•	Maintain a simple lending history for each book (e.g., who borrowed it, when it was returned).
 */

 import java.util.ArrayList;
 import java.util.List;

class NewBook{
    String title, author;
    int ISBN;
    boolean isCheckedOut;

    public NewBook(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public int getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    
}

    

class Library{
    List<NewBook>books;

    public Library() {
        books= new ArrayList<>();
    }

    public NewBook searchByISBN(int ISBN) {
        for (NewBook book : books) {
            if (book.getISBN() == ISBN) {
                return book;
            }
        }
        System.out.println("Book with ISBN '" + ISBN + "' not found.");
        return null;
    }
    
    public void addBook(String title, String author, int ISBN) {
        books.add(new NewBook(title, author, ISBN));
        System.out.println("Book added: " + title + " by " + author);
    }

    public void searchBook(String title) {
        for (NewBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void checkOutBook(String title) {
        for (NewBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.checkOut();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (NewBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }


   
}
public class LibraryBookManagement {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 123456);
        library.addBook("1984", "George Orwell", 789012);

        library.searchBook("The Great Gatsby");

        library.checkOutBook("1984");

       
        library.checkOutBook("1984");

        library.returnBook("1984");

        
        library.returnBook("1984");
    }
}