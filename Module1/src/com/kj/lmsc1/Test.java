package com.kj.lmsc1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // menu options
        Store store = new Store();
        while (true) {

            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Show all books");
            System.out.println("2. Add a book");
            System.out.println("3. Delete a book");
            System.out.println("4. Exit");

            // get user input
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            ArrayList<Book> books = store.getBooks();
            // switch statement to handle user input
            switch (choice) {
                case 1:
                    // show all books
                    if (store.getBooks().isEmpty()) {
                        System.out.println("No books found");
                        break;
                    }
                    store.showAllBooks();
                    break;
                case 2:
                    // add a book
                    System.out.println("Enter book id:");
                    int id = input.nextInt();
                    for (Book book : store.getBooks()) {
                        if (book.getId() == id) {
                            System.out.println("Book with this id already exists, please enter a different id.");

                            break;
                        }
                    }
                    System.out.println("Enter book title:");
                    String title = input.next();
                    System.out.println("Enter book author:");
                    String author = input.next();
                    store.addBook(new Book(id, title, author));
                    System.out.println("Book added successfully");
                    break;

                case 3:
                    // delete a book
                    System.out.println("Enter the book id to delete:");
                    int bookId = input.nextInt();
                    int size = books.size();
                    for (Book book : books) {
                        if (book.getId() == bookId) {
                            store.removeBook(book);
                            System.out.println("Book deleted successfully");
                            break;
                        }
                    }
                    if (size == books.size())
                            System.out.println("Book not found");
                    break;

                case 4:
                    store.exit();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

    }
}
