package org.crud;

import org.crud.book.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bs = new BookService();
        bs.creatBook(123,"Pyramid Without Summit","Mohamed Alghaleez",135.5f,"Very nice book");

    }
}