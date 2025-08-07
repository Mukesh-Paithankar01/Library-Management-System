package com.elavatelabs;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Book List:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (b.isIssued) {
                    System.out.println("Book is already issued.");
                } else {
                    b.isIssued = true;
                    System.out.println("Book issued successfully.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is not issued.");
                }
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }
}
