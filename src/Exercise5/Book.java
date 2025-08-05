package Exercise5;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = new Author[]{author};
        this.price = price;
        this.qty = 0; // Default quantity is set to 0
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < author.length - 1; i++) {
            authorNames += author[i].getName() + ", ";
        }
        authorNames += author[author.length - 1].getName();
        return authorNames;
    }
}
