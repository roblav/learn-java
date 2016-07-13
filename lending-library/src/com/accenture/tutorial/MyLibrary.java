package com.accenture.tutorial;

import java.util.ArrayList;

/**
 * Created by user on 05/01/16.
 */
public class MyLibrary {

    String name;
    ArrayList<Book> books;
    ArrayList<Person> people;

    public MyLibrary(String name){
        this.name = name;
        books = new ArrayList<Book>();
        people = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book b1) {
        this.books.add(b1);
    }

    public void removeBook(Book b1) {
        this.books.remove(b1);
    }

    public void addPerson(Person p1) {
        this.people.add(p1);
    }

    public void removePerson(Person p1) {
        this.people.remove(p1);
    }

    public boolean checkOut(Book b1, Person p1) {
        if(b1.getPerson() == null){
            b1.setPerson(p1);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIn(Book b1) {
        if(b1.getPerson() != null){
            b1.setPerson(null);
            return true;
        }else {
            return false;
        }
    }
}
