package org.crud.book;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private long id;
    private String title;
    private String author;
    private float unitCoast;
    private String description;

    public Book() {
    }

    public Book(long id, String title, String author, float unitCoast, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.unitCoast = unitCoast;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getUnitCoast() {
        return unitCoast;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUnitCoast(float unitCoast) {
        this.unitCoast = unitCoast;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
