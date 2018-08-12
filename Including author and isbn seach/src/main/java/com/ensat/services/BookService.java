package com.ensat.services;


import com.ensat.entities.Book;

public interface BookService {

    Iterable<Book> listAllBooks();
    /*List<Object> listAllBooksIsbn();*/

    Book getBookById(Integer id);

    Book saveBook(Book book);

    void deleteBook(Integer id);

    Book findByIsbn(String isbn);

    Book findByAuthor(String author);
}