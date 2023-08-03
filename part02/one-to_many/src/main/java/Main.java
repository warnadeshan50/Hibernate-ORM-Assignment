import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book("B01","Key is Boor",4,author);
        Book book1 = new Book("B02","Girl didn't expert",3,author);
        author.setId("A01");
        author.setAge(23);
        author.setName("Sumana Paliyage");
        ArrayList <Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book);
        author.setBooks(books);
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        session.persist(book1);
        session.persist(author);
        transaction.commit();
        session.close();
    }
}
