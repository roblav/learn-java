package com.accenture.tutorial;

import junit.framework.TestCase;

/**
 * Created by user on 05/01/16.
 */

public class BookTest extends TestCase{

    public void testBook() {
        Book b1 = new Book("Great Expectations");
        assertEquals("Great Expectations", b1.title);
        assertEquals("unknown author", b1.author);
    }

    public void testGetPerson(){
        //Create a book object
        Book b2 = new Book("War and Peace");
        Person p2 = new Person();
        p2.setName("Elvis");

        //Method to say this book is loaned to this person
        b2.setPerson(p2);

        //get the name of the person who has the book
//        Person testPerson = b2.getPerson();
//        String testName = testPerson.getName();
        String testName = b2.getPerson().getName();
        //Test who has checked out the book
        assertEquals("Elvis", testName);


    }
}
