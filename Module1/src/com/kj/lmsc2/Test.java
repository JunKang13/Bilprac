package com.kj.lmsc2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// deprecated -- use file streams IO to read and write objects to files
// too lazy to implement everything but the idea is below

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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
//                    if (store.getBooks().isEmpty()) {
//                        System.out.println("No books found");
//                        break;
//                    }
                    File f1 = new File("E:\\Java_workspace\\Bili_practice\\Module1\\src\\com\\kj\\lmsc2\\books.txt");
                    if (f1.exists()) {
                        System.out.println("File exists");
                    } else {
                        System.out.println("File does not exist");
                        break;
                    }

                    FileInputStream file1 = new FileInputStream(f1);
                    ObjectInputStream ois = new ObjectInputStream(file1);
                    ArrayList<Book> list1 = (ArrayList<Book>)(ois.readObject());
                    for (Book book : list1) {
                        System.out.println("Book ID: " + book.getId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor());
                    }


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
                    ArrayList<Book> list = store.getBooks();
                    System.out.println("Enter book title:");
                    String title = input.next();
                    System.out.println("Enter book author:");
                    String author = input.next();
                    list.add(new Book(id, title, author));

                    // 用流的方式写入文件
                    File f = new File("E:\\Java_workspace\\Bili_practice\\Module1\\src\\com\\kj\\lmsc2\\books.txt");
                    FileOutputStream file = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(file);
                    oos.writeObject("\n" + list);
                    oos.close();

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
