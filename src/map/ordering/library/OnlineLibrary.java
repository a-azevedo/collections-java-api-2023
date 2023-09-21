package map.ordering.library;

import java.util.*;

public class OnlineLibrary {

    private Map<String, Book> library;

    public OnlineLibrary (){
        library = new HashMap<>();
    }

    public void addBook (String link, String title, String author, double price){
        library.put(link, new Book(title, author, price));
    }

    public void removeBook (String title){
        for (Map.Entry<String, Book> entry : library.entrySet()){
            if(entry.getValue().getTitle().equalsIgnoreCase(title)){
                library.remove(entry.getKey());
                break;
            }
        }
    }

    public void showBooksByPrice (){
        List<Map.Entry<String, Book>> booksByPrice = new ArrayList<>(library.entrySet());
        Collections.sort(booksByPrice, new Book.ComparatorBookByPrice());
        System.out.println(booksByPrice);
    }

    public List<Book> getBookByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if (!library.isEmpty()){
            for(Book book : library.values()){
                if(book.getAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public Book getMoreExpensiveBook(){
        Book moreExpensiveBook = null;
        double maxValue = Double.MIN_VALUE;
        for (Book book : library.values()){
            if (book.getPrice() > maxValue){
                maxValue = book.getPrice();
                moreExpensiveBook = book;
            }
        }
        return moreExpensiveBook;
    }

    public Book getLessExpensiveBook(){
        Book lesExpensiveBook = null;
        double minValue = Double.MAX_VALUE;
        for (Book book : library.values()){
            if (book.getPrice() < minValue){
                minValue = book.getPrice();
                lesExpensiveBook = book;
            }
        }
        return lesExpensiveBook;
    }

    public static void main(String[] args) {

        OnlineLibrary library = new OnlineLibrary();

        library.addBook("https://www.amazon.com.br/dp/8550801488","Pai Rico, Pai Pobre"," Robert T. Kiyosaki ",52d);
        library.addBook("https://www.amazon.com.br/dp/8595081530","O homem mais rico da Babilônia","Gerge S Clason",28.50d);
        library.addBook("https://www.amazon.com.br/dp/6555606495", "Percy Jackson: O Cálice dos Deuses", "Rick Riordan", 59d);

        library.removeBook("Pai Rico, Pai Pobre");

        library.showBooksByPrice();
        System.out.println(library.getBookByAuthor("Rick Riordan"));
        System.out.println(library.getMoreExpensiveBook());
        System.out.println(library.getLessExpensiveBook());

    }

}
