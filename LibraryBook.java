class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryBook {

    static Book updateBook(Book b) {
        b.title = "Java Programming";
        b.author = "James Gosling";
        return b;
    }

    public static void main(String[] args) {

        Book b1 = new Book("C Programming", "Dennis");

        System.out.println("Before Update:");
        System.out.println("Title  : " + b1.title);
        System.out.println("Author : " + b1.author);

        b1 = updateBook(b1);

        System.out.println("\nAfter Update:");
        System.out.println("Title  : " + b1.title);
        System.out.println("Author : " + b1.author);
    }
}
