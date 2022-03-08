package collections;

import java.util.HashMap;

class Book {
    protected int id;
    protected String name;
    protected String author;
    protected String publisher;
    protected int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

public class BookDriver {
    public static void main(String[] args) {

        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);

        HashMap<Integer, Book> books = new HashMap<>();
        books.put(b1.id, b1);
        books.put(b2.id, b2);
        books.put(b3.id, b3);
        books.put(b4.id, b4);

        books.values().stream().forEach(System.out::println);
        System.out.println();

        books.values().stream().forEach(b -> b.setQuantity(2 * b.quantity));
        books.values().stream().forEach(System.out::println);
        System.out.println();

        books.merge(233, books.get(233), (a, b) -> {
            a.publisher += " USA";
            return a;
        });
        books.values().stream().forEach(System.out::println);
        System.out.println();

    }
}
