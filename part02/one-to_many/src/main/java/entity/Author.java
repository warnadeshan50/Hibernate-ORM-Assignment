package entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Author {
    @Id
    private String id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "authors")
    private List <Book> books;

    public Author() {
    }

    public Author(String id, String name, int age, List<Book> books) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.books = books;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
