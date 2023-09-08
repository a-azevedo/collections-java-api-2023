package bookshelf;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class CatalogBook {
    List<Book> bookCatalog;

    public CatalogBook(){
        this.bookCatalog = new ArrayList<>();
    }

    public void addBook(String title, String author, LocalDate publicationDate){
        bookCatalog.add(new Book(title,author,publicationDate));
    }
    public List<Book> findByAuthor(String author){
        List<Book> books = new ArrayList<>();
        if(!bookCatalog.isEmpty()){
            for(Book book : bookCatalog){
                if((book.getAuthor().toLowerCase()).contains(author.toLowerCase())){
                    books.add(book);
                }
            }
        }
        return books;
    }

    public List<Book> findByPeriod(LocalDate initalDate, LocalDate finalDate){
        List<Book> books = new ArrayList<>();
        for(Book book : bookCatalog){
            if(book.getPublicationDate().isEqual(initalDate) || book.getPublicationDate().isAfter(initalDate)){
                if(book.getPublicationDate().isEqual(finalDate) || book.getPublicationDate().isBefore(finalDate)){
                    books.add(book);
                }
            }
        }
        //for(Book book : bookCatalog){
          //  int diff = book.getPublicationDate().compareTo(initalDate);
            //int diff2 = book.getPublicationDate().compareTo(finalDate);
            //if(diff >= 0 ){
              //  if(diff2 <= 0){
                //    books.add(book);
                //}
            //}
        //}
        return books;
    }

    public Book FindByTitle(String title){
        for (Book book : bookCatalog){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        CatalogBook catalogBook = new CatalogBook();

        LocalDate initialDate = LocalDate.of(2005,8,1);
        LocalDate finalDate = LocalDate.of(2010,8,15);

        catalogBook.addBook("As crônicas de Nárnia", " C. S. Lewis", LocalDate.of(2009,1,8));
        catalogBook.addBook("Ventos do Inverno", "George R.R. Martin", LocalDate.of(2023,8,5));
        catalogBook.addBook("A Sutil Arte de Ligar o Foda-se", "Mark Manson", LocalDate.of(2016,9,13));
        catalogBook.addBook("As crônicas de Gelo e Fogo", "George R.R. Martin", LocalDate.of(1996,8,1));

        System.out.println(catalogBook.findByPeriod(initialDate, finalDate));
        System.out.println(catalogBook.FindByTitle("ventsos do inverno"));

    }
}
