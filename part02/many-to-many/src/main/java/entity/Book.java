package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;


@Entity
public class Book {
    @Id
    private String id;
    private String name;
    private int qty;
    @ManyToMany
    private List<Author> authors;

    public Book() {
    }

    public Book(String id, String name, int qty, List<Author> authors) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.authors = authors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
