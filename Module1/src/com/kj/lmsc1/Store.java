package com.kj.lmsc1;

import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // show all books
    public void showAllBooks() {
        for (Book book : this.books) {
            System.out.println("Book ID: " + book.getId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor());
        }
    }

    // add book
    public void addBook(Book book) {
        this.books.add(book);
    }
    // remove book
    public void removeBook(Book book) {
        this.books.remove(book);
    }
    // exit
    public void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

//    public Store(ArrayList<Book> books) {
//        this.books = books;
//    }
}
