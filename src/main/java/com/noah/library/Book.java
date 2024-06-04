package com.noah.library;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Books")
@AllArgsConstructor
public class Book {

    @Id
    private String _id;


    private String Title;     // The title of a book


    private String Publisher;

  
    private String Author;    // The author of a book
 
    private int Num;
 
    private String Date;

    private String ISBN;
   
    private double Weeks;

//    public Book(String id , int num, String publisher, String author, String ISBN, String date, String title, double popular) {
//       this._id=id;
//        this.Num = num;
//        this.Publisher = publisher;
//        this.Author = author;
//        this.ISBN = ISBN;
//        this.Date = date;
//        this.Title = title;
//        this.Weeks = popular;
//    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        this.Publisher = publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int id) {
        this.Num = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPopular() {
        return Weeks;
    }

    public void setPopular(double popular) {
        this.Weeks = popular;
    }

    public int getYear() {
        return Integer.parseInt("20" + Date.substring(Date.length() - 2));
    }

    public String toString() {
        return Title + " by " + Author;
    }
}
