package com.accenture.tutorial;

/**
 * Created by user on 05/01/16.
 */
public class Person {
    //fields
    private String name; //name of person
    private int maximumBooks; //most books person can check out

    //constructors

    public Person(){
        name = "unknown name";
        maximumBooks = 3;
    }

    // Getter and Setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumBooks() {
        return maximumBooks;
    }

    public void setMaximumBooks(int maximumBooks) {
        this.maximumBooks = maximumBooks;
    }

    public String toString(){

        return this.getName() + " (" + this.getMaximumBooks() + " books)";
    }
}
