package bookshelf;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CatalogBook {
    List<Book> bookCatalog;

    public CatalogBook(){
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(String title, String author, LocalDate publicationDate){
        bookCatalog.add(new Book(title,author,publicationDate));
    }
    public List findByAuthor(String author){
        List<Book> books = new ArrayList<>();
        for(Book book : bookCatalog){
            if((book.getAuthor().toLowerCase()).contains(author.toLowerCase())){
                books.add(book);
            }
        }
        return books;
    }

    public List findByPeriod(LocalDate initalDate, LocalDate finalDate){
        List<Book> books = new ArrayList<>();
        Period period = Period.between(initalDate, finalDate);
        for(Book book : bookCatalog){
            if(book.getPublicationDate().equals(period)){
                books.add(book);
            }
        }
        return books;
    }

    public static void main(String[] args) {

        CatalogBook catalogBook = new CatalogBook();

        catalogBook.addBook("As crônicas de Nárnia", " C. S. Lewis", LocalDate.parse("01/08/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        catalogBook.addBook("Ventos do Inverno", "George R.R. Martin", LocalDate.parse("01/08/2020",DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        catalogBook.addBook("As crônicas de Gelo e Fogo", "George R.R. Martin", LocalDate.parse("01/08/1996",DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(catalogBook.findByPeriod(
                LocalDate.parse("01/08/1995",DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                LocalDate.parse("01/08/2021",DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        ));
    }
}
