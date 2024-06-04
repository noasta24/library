package com.noah.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Library {
    @Autowired
    LibraryRepo lp;
  
 

    public List<Book>  findAllBooks(){

        return lp.findAll();
    }
    public List<Book> findBooksByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<Book>();
        List<Book> books=findAllBooks();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
    public List<Book> findBooksByYear(int year){
        List<Book> booksByYear = new ArrayList<Book>();
        List<Book> books=findAllBooks();
        for (Book book : books) {
            if (book.getYear()==year) {
                booksByYear.add(book);
            }
        }
        return booksByYear;
    }
}
