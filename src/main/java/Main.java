import entities.Book;
import entities.EBook;
import entities.PaperBook;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = factory.createEntityManager();
        EBook book = new EBook();
        book.setTitle("Title");
        book.setDownloadUrl("url");
        PaperBook paperBook = new PaperBook();
        paperBook.setTitle("Title");
        paperBook.setInStock("url");
        em.getTransaction().begin();
        em.persist(book);
        em.persist(paperBook);
        em.getTransaction().commit();
    }
}
