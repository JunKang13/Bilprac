package com.kj.lmsc2;

public class Book implements java.io.Serializable{
    private int id;

    public int getId() {
        return id;
    }

    public Book(int id, String title, String author) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
