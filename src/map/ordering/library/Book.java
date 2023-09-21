package map.ordering.library;

import java.util.Comparator;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public static class ComparatorBookByPrice implements Comparator<Map.Entry<String, Book>> {

        @Override
        public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
            return Double.compare(o1.getValue().getPrice(), o2.getValue().getPrice());
        }
    }
}
