import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId("B01");
        book.setName("Booklodiya");
        book.setQty(4);

        Book book1 = new Book();
        book1.setId("B02");
        book1.setName("Gaththagaman Dunna");
        book1.setQty(6);

        Author author = new Author();
        Author author1 = new Author();

        author.setId("A01");
        author.setName("Sajith Puthano");
        author.setAge(89);

        author1.setId("A02");
        author1.setName("Mahinda Baiya");
        author1.setAge(100);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();

        books.add(book);
        books.add(book1);

        authors.add(author);
        authors.add(author1);

        book.setAuthors(authors);
        book1.setAuthors(authors);

        author.setBooks(books);
        author1.setBooks(books);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        session.persist(book1);
        session.persist(author);
        session.persist(author1);
        transaction.commit();
        session.close();


    }
}
