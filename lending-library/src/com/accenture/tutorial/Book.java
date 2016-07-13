package com.accenture.tutorial;

/**
 * Created by user on 05/01/16.
 */
public class Book {

    String title;
    String author;
    Person person;

    public Book(String title) {
        this.title = title;
        this.author = "unknown author";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPerson(Person p2) {
        this.person = p2;
    }

    public Person getPerson() {
        return this.person;
    }
}
