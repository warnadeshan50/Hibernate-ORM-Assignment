import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("1","King Baba",4);
        Author author = new Author("1","Saman Endarimuni",23,book);

        Book book1 = new Book("2","Rawanag Kate Dath",10);
        Author author1 = new Author("3","Krimanthi Munati",44,book1);
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author);
        session.persist(book);
        session.persist(author1);
        session.persist(book1);
        transaction.commit();
        session.close();

    }
}
