package com.ensat.services;

import com.ensat.entities.Book;
import com.ensat.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> listAllBooks() {
        return bookRepository.findAll();
    }


    /*@Override
    public List<Object> listAllBooksIsbn() {
        List<Object> book = bookRepository.findIsbn();
       *//* Date date = null;
        try {
            date = new SimpleDateFormat("MM-dd-yyyy").parse(book.getReleaseDate().toString());
            DateFormat df=
        } catch (ParseException e) {
            e.printStackTrace();
        }
        book.setReleaseDate(date);*//*
        return book;
    }*/
    @Override
    public Book getBookById(Integer id) {
        Book book = bookRepository.findOne(id);
       /* Date date = null;
        try {
            date = new SimpleDateFormat("MM-dd-yyyy").parse(book.getReleaseDate().toString());
            DateFormat df=
        } catch (ParseException e) {
            e.printStackTrace();
        }
        book.setReleaseDate(date);*/
        return book;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.delete(id);
    }

    public Book findByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    public Book findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }
}

