package org.crud.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    private Book book;

    public Book creatBook(long id,String title,String author,float unitCoast,String description) {
        book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setUnitCoast(unitCoast);
        book.setDescription(description);

        et.begin();
        em.persist(book);
        et.commit();

        return book;
    }

    public Book creatBook(Book book){
        et.begin();
        em.persist(book);
        et.commit();

        return book;
    }

    public Book findBook(long id){
        return em.find(book.getClass(),id);
    }

    public boolean raiseUnitCoast(long id,float raise) {
        book=findBook(id);

        if(book!=null) {
            et.begin();
            book.setUnitCoast(book.getUnitCoast()+raise);
            et.commit();
        }

        return book!=null;
    }

    public boolean removeBook(long id){
        book = findBook(id);

        if(book!=null) {
            et.begin();
            em.remove(book);
            et.commit();
        }

        return book!=null;
    }

    public void removeBook(Book b){
        et.begin();
        em.remove(book);
        et.commit();
    }
}
