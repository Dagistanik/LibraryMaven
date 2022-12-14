package com.library.project;

import com.library.project.products.*;
import com.library.project.random.MonthRandom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.library.string.MirrorCopy.mirror;
import static org.junit.Assert.*;
import static sun.nio.cs.Surrogate.is;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp(){
        library = new Library(5);

    }

    @Test
    public void addTest(){
        assertEquals(library.publications.size(), 5);
        Book book2 = new Book(2, "book2", "author2", 2022, 765);
        library.publications.add(book2);
        assertEquals(library.publications.size(), 6);
    }

    @Test
    public void getBooksTest(){
        Library library1 = new Library(0);
        List list = new ArrayList();
        Book book2 = new Book(2, "book2", "author2", 2022, 765);
        DVD dvd = new DVD(21, "ed", 34);
        library1.publications.add(book2);
        library1.publications.add(dvd);
        list.add(book2);
        assertEquals(library1.getBooks(), list);



    }
}
