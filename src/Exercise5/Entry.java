package Exercise5;

public class Entry {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("A", "a@gmail.com");
        authors[1] = new Author("B", "b@gmail.com");
        authors[2] = new Author("C", "c@gmail.com");

        Book book1 = new Book("Book1", authors[0], 29.99);
        System.out.println(book1.getAuthorNames());

    }
}
