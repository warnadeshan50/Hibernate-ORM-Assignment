import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //create
        Book book = new Book("B01","IJSE Eke IGana ganna Hati",1);
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        transaction.commit();
        session.close();

        //read
        scanner.nextLine();

        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        Book book1 = session1.load(Book.class,"B01");
        System.out.println(book1.getName());
        transaction1.commit();
        session1.close();

        //update
        scanner.nextLine();

        book1.setName("WaRBS");
        Session session2 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction2 = session2.beginTransaction();
        session2.update(book1);
        transaction2.commit();
        session2.close();

        //delete
        scanner.nextLine();
        Session session3 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction3 = session3.beginTransaction();
        session3.delete("B01",book);
        transaction3.commit();
        session3.close();
    }
}
