class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookObjectPassing {

    static void display(Book b) {
        System.out.println("Book Title  : " + b.title);
        System.out.println("Author      : " + b.author);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling");

        display(b1);
    }
}
